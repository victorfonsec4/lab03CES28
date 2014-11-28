package ex01;

public class Facade{
	
	BancoDeDados banco = new BancoDeDados();
	
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