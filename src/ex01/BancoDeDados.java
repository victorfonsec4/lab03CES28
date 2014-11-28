package ex01;

import java.util.Vector;

public class BancoDeDados {
	Vector<Produto> produtos;
	Vector<Cliente> clientes;

	public BancoDeDados() {
		produtos = new Vector<Produto>();
		clientes = new Vector<Cliente>();
		produtos.add(Produto.create("testeProd", 0, 10));
		clientes.add(Cliente.create("testeCli", 0));
	}

	public Cliente selectCliente(int id) {
		return clientes.get(0);
	} 
	
	public Produto selectProduto(int id) {
		return produtos.get(0);
	} 
	
	public void processarPagamento(Cliente cliente, double valor) {
		
	}
	
}
