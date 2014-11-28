package ex01;

public class Facade{
	
	public void registrar(String nome, int clienteId) {
		Mercado.registrar(nome, clienteId);
	}
	
	public void comprar(int prodId, int clienteId) {
		Mercado.comprar(prodId, clienteId);
	}
	
	public void fecharCompra(int clienteId) {
		Mercado.fecharCompra(clienteId);
	}
 
}
