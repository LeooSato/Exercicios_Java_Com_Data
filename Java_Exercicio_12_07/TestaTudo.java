package Java_Exercicio_12_07;

public class TestaTudo {

	public static void main(String[] args) {
		Cachorro Catioro = new Cachorro();
		Cavalo Cavalo = new Cavalo();
		Preguica Preguica = new Preguica();
		
		
		System.out.println("Cachorro Auauau");
		Catioro.nome();
		Catioro.idade();
		Catioro.pelo();
		Catioro.emiteSom();
		Catioro.cor();
		Catioro.corre();
		
		
		System.out.println("\nCavalo IRRAAA");
		Cavalo.nome();
		Cavalo.idade();
		Cavalo.pelo();
		Cavalo.emiteSom();
		Cavalo.cor();
		Cavalo.corre();
		
		
		System.out.println("\nPreguiça Dorme Dorme");
		Preguica.nome();
		Preguica.idade();
		Preguica.pelo();
		Preguica.emiteSom();
		Preguica.cor();
		Preguica.subirArvore();

	}

}
