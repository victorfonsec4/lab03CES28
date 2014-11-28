package ex01;

import java.util.Vector;

public class Carrinho {

	private Vector<Produto> listaProdutos;

	private Carrinho() {
		listaProdutos = new Vector<Produto>();
	}
	
	public static Carrinho create() {
		return new Carrinho();
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
