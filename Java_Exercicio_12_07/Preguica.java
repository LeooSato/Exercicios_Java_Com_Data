package Java_Exercicio_12_07;

public class Preguica implements Animal{
	
	@Override
	public void nome() {
		System.out.println("RoncRonc");
		
	}

	@Override
	public void idade() {
		System.out.println("10 anos");
		
	}

	@Override
	public void pelo() {
		System.out.println("Sim");
		
	}

	@Override
	public void emiteSom() {
		System.out.println("Desconhecido...");
		
	}

	@Override
	public void cor() {
		System.out.println("Marrom");
		
	}
	
	public void subirArvore() {
		System.out.println("Sobe e dorme, zzzzzzz");
	}

}
