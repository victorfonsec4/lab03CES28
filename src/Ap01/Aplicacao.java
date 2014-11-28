package Ap01;
import MercadoVirtual.Carrinho;
import MercadoVirtual.Cliente;
import MercadoVirtual.Facade;
import MercadoVirtual.Produto;
import Repositorio.BancoDeDados;

public class Aplicacao {


	public static void main(String[] args){ 
	
		Facade f = Facade.create();
		
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
