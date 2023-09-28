package ejercicio4;

public class Cliente extends Thread {

	private GestorImpresoras gestor;

	public Cliente(GestorImpresoras gestor, String nombre) {
		super(nombre);
		this.gestor = gestor;
	}

	public void run() {
		try {
			gestor.imprimir(getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		gestor.liberarImpresora(getName());
	}

}
