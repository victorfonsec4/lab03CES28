package Ap01;
import ex01.Carrinho;
import ex01.BancoDeDados;
import ex01.Cliente;
import ex01.Facade;
import ex01.Produto;

public class Aplicacao {

	public Aplicacao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){ 
	
		Facade f = new Facade();
		
		BancoDeDados banco = new BancoDeDados();
		// registrar comprador 
		f.registrar("ze", 123);
		// realizar uma compra
		f.comprar(223, 123);
		// realizar outra compra
		f.comprar(342, 123);
		// fechar compra
		f.fecharCompra(123);
	}
}
