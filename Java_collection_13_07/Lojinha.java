package Java_collection_13_07;

public class Lojinha {

	private String nomeProduto;
	private double valor;
	
	public Lojinha(String nomeProduto, double valor) {
		super();
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "Nome do produto: " + this.nomeProduto + ", " + this.valor;
	}
	
}
