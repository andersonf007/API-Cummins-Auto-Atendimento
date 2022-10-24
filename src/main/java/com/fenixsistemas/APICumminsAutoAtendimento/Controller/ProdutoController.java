package com.fenixsistemas.APICumminsAutoAtendimento.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Produto;
import com.fenixsistemas.APICumminsAutoAtendimento.Fachada.Fachada;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	@Autowired
	private Fachada fachada;
	
	@GetMapping("/buscarProdutos")
	public ResponseEntity<ArrayList<Produto>> buscarProdutos() {
		ArrayList<Produto> listProduto = new ArrayList<>();
		listProduto = fachada.buscarProdutos();
		if(listProduto == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(listProduto, HttpStatus.OK);
		}
	}
	
	@GetMapping("/buscarProdutosPorCategoria")
	public ResponseEntity<ArrayList<Produto>> buscarProdutosPorCategoria(@RequestParam int idCategoria) {
		ArrayList<Produto> listProduto = new ArrayList<>();
		listProduto = fachada.buscarProdutosPorCategoria(idCategoria);
		if(listProduto == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(listProduto, HttpStatus.OK);
		}
	}
}
