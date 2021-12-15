package javaparte5;

public class Cliente {

	//atributos do cliente
	
	String Nome;
	String Telefone;
	String CPF;
	String Endereco;
	String Email;
	String Genero;
	int idade;
	
	// atributos do produto oferecido ao cliente
	double qntcomprada;
	double precoproduto;
	int numero1;
	int numero2;
	int soma;
	
	//métodos
	
		void ExibeCadastro() {
		
		System.out.println( "Nome : " + Nome + " CPF : " + CPF + " Telefone : " + Telefone );
		System.out.println("Endereço : " + Endereco + " Email : " + Email + " Gênero : " + Genero);
		System.out.println(" Idade : " + idade);
		
	}
	
	

	double ValorCompra() {
		
		return qntcomprada * precoproduto;
		
	}
	
	void IdadeMinima(int idade) {
		
		if( idade > 18) {
			
			System.out.println("você pode comprar");
		}
		
		else if( idade < 18) {
			
			System.out.println("você não pode comprar");
		}
		
		
	}
	
	
	
	
	
	
	



}

