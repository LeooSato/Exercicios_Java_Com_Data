package Java_Exercicio_12_07;

public class Cavalo implements Animal{
	
	@Override
	public void nome() {
		System.out.println("Cuecasso");		
		
	}

	@Override
	public void idade() {
		System.out.println("2 anos");
		
	}

	@Override
	public void pelo() {
		System.out.println("Sim");
		
	}

	@Override
	public void emiteSom() {
		System.out.println("Relincho");
		
	}

	@Override
	public void cor() {
		System.out.println("Branco");
		
	}
	
	public void corre() {
		System.out.println("Até demais");
	}
}
