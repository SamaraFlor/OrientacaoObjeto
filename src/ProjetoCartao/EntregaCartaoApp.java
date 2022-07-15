package ProjetoCartao;

import java.util.ArrayList;

import ProjetoCartao.model.Cliente;
import ProjetoCartao.model.Endereco;

public class EntregaCartaoApp {

	public static void main(String[] args) {
	
	Endereco endereco = new Endereco();
	endereco.cep= "05359-010";

	
	Cliente cliente = new Cliente ();
	
	
	
	try {
		cliente.adicionaEndereco(endereco);
		System.out.println("endereço adicionado");
	} catch (Exception e) {
		System.err.println("Houve um erro");
	}
	

	}

}
