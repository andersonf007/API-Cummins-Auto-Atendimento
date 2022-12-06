package com.fenixsistemas.APICumminsAutoAtendimento.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Opcional;
import com.fenixsistemas.APICumminsAutoAtendimento.Fachada.Fachada;

@RestController
@RequestMapping("/opcionais")
public class OpcionaisController {
	@Autowired
	private Fachada fachada;
	
	@GetMapping("/buscarOpcionaisDeUmProduto")
	public ResponseEntity<ArrayList<Opcional>> buscarOpcionaisDeUmProduto(@RequestParam int idProduto){
		ArrayList<Opcional> listOpcional = new ArrayList<>();
		listOpcional = fachada.buscarOpcionaisDeUmProduto(idProduto);
		if(listOpcional == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(listOpcional, HttpStatus.OK);
		}
	}
	
}
