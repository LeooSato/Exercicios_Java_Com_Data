package Java_collection_13_07;

import java.util.ArrayList;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Lojinha produto1 = new Lojinha("Tv Modelo1", 1000);
	 	Lojinha produto2 = new Lojinha("Tv Modelo2", 600);
        Lojinha produto3 = new Lojinha("Relogio", 200);
        Lojinha produto4 = new Lojinha("Lâmpada", 20);
        Lojinha produto5 = new Lojinha("Celular marca1",250);
        Lojinha produto6 = new Lojinha("Tênis", 200);
        Lojinha produto7 = new Lojinha("Celular marca2", 200); 
        
        ArrayList<Lojinha> produto = new ArrayList<>();
        
        produto.add(produto1);
        produto.add(produto2);
        produto.add(produto3);
        produto.add(produto4);
        produto.add(produto5);
        produto.add(produto6);
        produto.add(produto7);
        
        System.out.println("=============================Compras===========================");
        for(int i = 0; i < produto.size(); i++) {
        	System.out.println(produto.get(i));
        }
        
        System.out.println("\n==========================Compras Final==============================");
        produto.remove(2);
        for(int i = 0; i < produto.size(); i++) {
        	System.out.println(produto.get(i));
        }
}
	
	
}
