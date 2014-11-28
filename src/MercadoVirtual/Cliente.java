package MercadoVirtual;

public class Cliente {

	private String _nome;
	private int _id;
	private Carrinho _carrinho;
	
	private Cliente(String nome, int id){
		this._nome = nome;
		this._id = id;
	}
	
	public static Cliente create(String nome, int id) {
			return new Cliente(nome, id);
	} 
	
	public void adicionarCarrinho(Carrinho c) {
		this._carrinho = c;
	}
	
	public Carrinho getCarrinho() {
		return this._carrinho;
	}
}
