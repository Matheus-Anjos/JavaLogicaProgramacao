package javaparte6;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro cr = new Cachorro();
		Cavalo cl = new Cavalo();
		Preguica pg = new Preguica();
		
		cr.setNome("Rex");
		cr.setIdade(10);
		
		System.out.println(cr.getNome());
		System.out.println(cr.getIdade());
		
		cr.emitirSom();
		cr.correr();
		
		
		cl.setNome("\nCavo");
		cl.setIdade(15);
		
		System.out.println(cl.getNome());
		System.out.println(cl.getIdade());
		
		cl.emitirSom();
		cl.correr();
		
		
		pg.setNome("\ndorminhoco");
		pg.setIdade(7);
		
		System.out.println(pg.getNome());
		System.out.println(pg.getIdade());
		
		pg.emitirSom();
		pg.subir();

	}

}
