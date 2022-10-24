package com.fenixsistemas.APICumminsAutoAtendimento.Controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fenixsistemas.APICumminsAutoAtendimento.Entidade.Venda;
import com.fenixsistemas.APICumminsAutoAtendimento.Fachada.Fachada;

@RestController
@RequestMapping("/venda")
public class VendaController {
	
	@Autowired
	private Fachada fachada;
	
	@RequestMapping(value = "inserirVenda", method = RequestMethod.POST)
	public ResponseEntity<String> inserirVenda(@RequestBody String dados){
		
		int idCaixa = fachada.buscarIdCaixa();
		int idVenda = fachada.buscarIdProximaVenda();
		try {
			if(idCaixa == 0 || idVenda == 0) {
				return new ResponseEntity<>("error",  HttpStatus.BAD_REQUEST);
			}
			JSONObject obj = new JSONObject(dados);
			String data = obj.getString("data");
			int usuarioAbertura = obj.getInt("usuarioAbertura");
			double desconto = obj.getDouble("desconto");
			double acrescimo = obj.getDouble("acrescimo");
			double valorTotal = obj.getDouble("valorTotal");
			String tipoVenda = obj.getString("tipoVenda");
			int numeroMesa = obj.getInt("numeroMesa");
			int numeroComanda = obj.getInt("numeroComanda");
			Venda venda = new Venda(idVenda,data,8,usuarioAbertura,data,desconto,acrescimo,valorTotal,tipoVenda,numeroMesa,numeroComanda,idVenda,idCaixa,"Auto Atendimento");
			boolean validacao = fachada.inserirVenda(venda);
			if(validacao) {
				return new ResponseEntity<>("ok", HttpStatus.OK);
			}else {
				return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
			}
		} catch (Exception e) {
			return new ResponseEntity<>("Error", HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/verificarSeAVendaEstaAberta")
	public ResponseEntity<Integer> verificarSeAVendaEstaAberta(@RequestParam int numeroMesaComanda, @RequestParam String tipoVenda) {
		int id = fachada.verificarSeAVendaEstaAberta(numeroMesaComanda, tipoVenda);
		if(id == 0) {
			return new ResponseEntity<>(0, HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<>(id, HttpStatus.OK);
		}
	}

	@GetMapping("/verificarSeAVendaEstaAguardandoPagamento")
	public ResponseEntity<Integer> verificarSeAVendaEstaAguardandoPagamento(int numeroMesaComanda, String tipoVenda) {
		int id = fachada.verificarSeAVendaEstaAguardandoPagamento(numeroMesaComanda, tipoVenda);
		if(id == 0) {
			return new ResponseEntity<>(0, HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<>(id, HttpStatus.OK);
		}
	}
}
