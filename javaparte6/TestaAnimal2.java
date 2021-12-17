



package javaparte6;

public class TestaAnimal2 {

	public static void main(String[] args) {
		
		Animal2 an = new Animal2();
		Cavalo2 cv= new Cavalo2();
		Cachorro2 ch = new Cachorro2();
		Preguica2 pr = new Preguica2();
		
		EmissaoSom(an);
		EmissaoSom(cv);
		EmissaoSom(ch);
		EmissaoSom(pr);
		
		
		
	}

		static void EmissaoSom(Animal2 animal2) {
			
			System.out.println(animal2.emitirSom());
			
		}


}
