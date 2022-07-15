package ProjetoCartao.model;

import javax.management.RuntimeErrorException;

import org.w3c.dom.ranges.RangeException;

public class Pessoa {
	
	private static final int TAMANHO_CPF = 11;
	private static final int TAMANHO_CNPJ = 14;
	
	
	public enum tipoPessoa{FISICA,JURIDICA}
	public int codigo;
	public String nome;
	private String documento;
	public tipoPessoa tipo;
	
	public String getDocumento() {
		return documento;
	}
	 
	
	public void setDocumento(String documento) {
		if (documento == null || documento.isEmpty()) {
			throw new RuntimeException("Documento não pode ser nulo ou vazio");
		}
		
		if (documento.length() == TAMANHO_CPF) {
			setDocumento(documento,tipo = tipoPessoa.FISICA);
		}
		else if (documento.length() == TAMANHO_CNPJ) {
			tipo = tipoPessoa.JURIDICA;
	    }else {
	    	throw  new RuntimeException("documento invalido ");
	    }
	
	
		

		
	}
	
	private void setDocumento(String documento,tipoPessoa tipo) {
		this.documento = documento;
		this.tipo = tipo;
	}
	
	public tipoPessoa getTipo() {
		return tipo;
	}
}
