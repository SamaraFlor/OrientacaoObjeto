
public class Carro {
	
	String nome;
	String modelo;
	int capacidadeTanque;
	
	
	
	
	public Carro() {
		
	}


	public Carro(String nome, String modelo, int capacidadeTanque) {
		this.nome = nome;
		this.modelo = modelo;
		this.capacidadeTanque = capacidadeTanque;
	}
	

	public String getNome(String string) {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo(String string) {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCapacidadeTanque(int i) {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}


	
	

	
	
}
