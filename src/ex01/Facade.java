package ex01;

public class Facade{

	public void registrar(String nome, int clienteId) { 
		banco.registrar(nome, clienteId);
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
	
	BancoDeDados banco = new BancoDeDados(); 
}