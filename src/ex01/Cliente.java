package ex01;

public class Cliente {

	private static Cliente instance = null;
	private String _nome;
	private int _id;
	private Carrinho _carrinho;
	
	private Cliente(String nome, int id){
		this._nome = nome;
		this._id = id;
	}
	
	public static Cliente create(String nome, int id) {
		if (instance == null)
			return new Cliente(nome, id);
		else
			return instance;
	} 
	
	public void adicionarCarrinho(Carrinho c) {
		this._carrinho = c;
	}
	
	public Carrinho getCarrinho() {
		return this._carrinho;
	}
}
