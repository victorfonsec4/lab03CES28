package MercadoVirtual;

public class BancoDeDados {
	Produto produto;
	Cliente cliente;

	public BancoDeDados() {
		this.produto = Produto.create("testeProd", 0, 1);
		
		this.cliente = Cliente.create("testeCli", 0);
		Carrinho carrinho = Carrinho.create();
		cliente.adicionarCarrinho(carrinho);
	}

	public Cliente selectCliente(int id) {
		return this.cliente;
	} 
	
	public Produto selectProduto(int id) {
		return this.produto;
	} 
	
	public void processarPagamento(Cliente cliente, double valor) {
	}
	
	public void registrar(String nome, int clienteId){
		Cliente cliente = Cliente.create(nome, clienteId);
		Carrinho carrinho = Carrinho.create();
		cliente.adicionarCarrinho(carrinho);
	}
	
}
