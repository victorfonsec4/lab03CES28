package ex01;

import java.util.Vector;

public class Carrinho {

	private static Carrinho instance = null;
	private Vector<Produto> listaProdutos;

	private Carrinho() {
		listaProdutos = new Vector<Produto>();
		
	}
	
	public static Carrinho create() {
		if(instance == null)
			instance = new Carrinho();
		return instance;
	} 
	
	public void adicionar (Produto p) {
		listaProdutos.add(p);
		
	} 
	
	public double getTotal() {
		double soma = 0;
		for(Produto p : listaProdutos)
			soma += p.getPreco();
		return soma;
	}
	
}
