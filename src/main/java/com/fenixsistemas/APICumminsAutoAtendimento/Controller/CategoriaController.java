package com.fenixsistemas.APICumminsAutoAtendimento.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Categoria;
import com.fenixsistemas.APICumminsAutoAtendimento.Fachada.Fachada;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	@Autowired
	private Fachada fachada;
	
	@GetMapping("/buscarCategorias")
	public ResponseEntity<ArrayList<Categoria>> buscarCategorias(){
		ArrayList<Categoria> listCategoria = new ArrayList<>();
		listCategoria = fachada.buscarCategorias();
		if(listCategoria == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(listCategoria, HttpStatus.OK);
		}
	}
}
