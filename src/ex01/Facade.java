package ex01;

public class Facade{
	static Facade instance = null;
	Mercado mercado;

	private Facade(){
		mercado = Mercado.create();
	}

	public static Facade create(){
		if(instance == null)
			instance = new Facade();
		return instance;
	}

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
