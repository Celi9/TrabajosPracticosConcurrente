package ejercicio3;

public class Proceso extends Thread {

	private Sincronizador s;

	public Proceso(Sincronizador s, String id) {
		super(id);
		this.s = s;
	}

	public void run() {

		while (true) {
			try {
				s.ejecutarProceso1(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}