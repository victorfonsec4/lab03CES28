package ex01;

public class Facade{
	Mercado mercado = Mercado.create();
	
	public void registrar(String nome, int clienteId) {
		mercado.registrar(nome, clienteId);
	}
	
	public void comprar(int prodId, int clienteId) {
		mercado.comprar(prodId, clienteId);
	}
	
	public void fecharCompra(int clienteId) {
		mercado.fecharCompra(clienteId);
	}
 
}
