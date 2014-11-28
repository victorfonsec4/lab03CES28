package ex01;

public class Mercado{
	static Mercado instance = null;
	BancoDeDados banco;

	private Mercado(){
		banco = new BancoDeDados();
	}

	public static Mercado create(){
		if(instance == null)
			instance = new Mercado();
		return instance;
	}
	
	public void registrar(String nome, int clienteId) { 
		Cliente cliente = Cliente.create(nome, clienteId);
		Carrinho car = Carrinho.create();
		cliente.adicionarCarrinho(car);
	}
	
	public void comprar(int prodId, int clienteId) {
		Cliente cliente = banco.selectCliente(clienteId);
		Produto produto = banco.selectProduto(prodId);
		cliente.getCarrinho().adicionar(produto);
	}
	
	public void fecharCompra(int clienteId) {
		Cliente cliente = banco.selectCliente(clienteId);
		double valor = cliente.getCarrinho().getTotal();
		banco.processarPagamento(cliente, valor);
	}
}
