package ejercicio4;

import java.util.concurrent.Semaphore;

public class GestorImpresoras {

	private Semaphore impresoras;

	public GestorImpresoras(int cantImpresoras) {
		impresoras = new Semaphore(cantImpresoras);
	}

	public void imprimir(String nombreCliente) throws InterruptedException {
		// adquiere un permiso para usar una impresora
		impresoras.acquire();
		System.out.println("Cliente (" + nombreCliente + ") imprimiendo");
		Thread.sleep(3000); // para simular el tiempo de impresion
	}

	public void liberarImpresora(String nombreCliente) {
		System.out.println("Cliente (" + nombreCliente + ") libero una impresora");
		impresoras.release();
	}
}
