package ProjetoCartao.model;

public class Endereco {

	// enum e semelhante a uma classe
	enum tipoEndereco {
		RESIDENCIAL, ENTREGA, TRABALHO
	}

	public String endereco;
	public String numero;
	public String complemento;
	public String cidade;
	public String bairro;
	public String cep;

}
