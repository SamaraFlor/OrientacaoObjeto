package UpCastDownCast;

public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		// ocorreu Upcast, funcionario classe mãe 
		Funcionario  vendedor = new Vendedor();
		
		Funcionario gerente =  new Gerente();
		
		Funcionario faxineiro = new Faxineiro();
		
		//Downcast explicito, devera ser evitado 
		//Vendedor vendedor1 = (Vendedor) new Funcionario();
		
		
		

	}

}
