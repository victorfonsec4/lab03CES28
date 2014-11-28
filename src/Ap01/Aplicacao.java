package Ap01;
import ex01.Carrinho;
import ex01.BancoDeDados;
import ex01.Produto;

import ex01.BancoDeDados;
import ex01.Carrinho;
import ex01.Cliente;

public class Aplicacao {

	public Aplicacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	BancoDeDados banco = new BancoDeDados();
	// registrar comprador 
	Cliente cliente = Cliente.create("ze", 123);
	Carrinho car = Carrinho.create(); 
	cliente.adicionarCarrinho(car);
	// realizar uma compra
	Produto produto = banco.selectProduto(223);
	cliente.getCarrinho().adicionar(produto); // realizar outra compra
	Produto produto = banco.selectProduto(342); cliente.getCarrinho().adicionar(produto);
	// fechar compra
	double valor = cliente.getCarrinho().getTotal();
	banco.processarPagamento(cliente, valor);
	
}
