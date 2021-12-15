package javaparte5;

public class TesteCliente {

	public static void main(String[] args) {
		
		
		// chamando a classe
		
		Cliente cl = new Cliente();
		
		cl.Nome = "Ze Ninguem";
		cl.Telefone = "3888-9929";
		cl.CPF = "00000000-0";
		cl.Endereco =" Rua dos Alfeneiros,numero 7";
		cl.Email = "zeninguem@hotmail.com";
		cl.Genero = "Masculino";
	    cl.idade = 15;
	    cl.qntcomprada = 20;
	    cl.precoproduto = 2.50;

	    cl.ExibeCadastro();
	    
	   System.out.println("O valor total de sua compra é "  + cl.ValorCompra());
	    
	    cl.IdadeMinima(cl.idade);
	
	}

}

