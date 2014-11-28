package ex01;

public class Cliente {

	public static Cliente create(String nome, int id) {
		return new Cliente();
	} 
	
	public void adicionarCarrinho(Carrinho c) {
		
	}
	
	public Carrinho getCarrinho() {
		return new Carrinho();
	}
}
