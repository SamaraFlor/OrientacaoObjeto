
public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
	
		carro.setCapacidadeTanque(23);
		carro.setModelo("ford");
		carro.setNome("hb20");
		
       System.out.println(carro.capacidadeTanque);
       System.out.println(carro.modelo);
       System.out.println(carro.nome);
	}

}
