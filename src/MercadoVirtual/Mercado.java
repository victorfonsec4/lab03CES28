package MercadoVirtual;

import Repositorio.BancoDeDados;

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
		System.out.println("Registrando cliente "+nome+" com id: "+clienteId);
		Cliente cliente = Cliente.create(nome, clienteId);
		Carrinho car = Carrinho.create();
		cliente.adicionarCarrinho(car);
	}
	
	public void comprar(int prodId, int clienteId) {
		System.out.println("Produto com id: "+prodId+" comprado pelo cliente de id: "+clienteId);
		Cliente cliente = banco.selectCliente(clienteId);
		Produto produto = banco.selectProduto(prodId);
		cliente.getCarrinho().adicionar(produto);
	}
	
	public void fecharCompra(int clienteId) {
		Cliente cliente = banco.selectCliente(clienteId);
		double valor = cliente.getCarrinho().getTotal();
		banco.processarPagamento(cliente, valor);
		System.out.println("Cliente de id: "+clienteId+" fechou compra no valor de "+valor);
	}
}
