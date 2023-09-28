package ejercicio3;

import java.util.concurrent.Semaphore;

public class Sincronizador {

	private Semaphore s1;
	private Semaphore s2;
	private Semaphore s3;

	public Sincronizador() {
		s1 = new Semaphore(1);
		s2 = new Semaphore(0);
		s3 = new Semaphore(0);
	}

	public void ejecutarProceso1(String id) throws InterruptedException {

		switch (id) {
		case "P1":
			s1.acquire();
			System.out.println("Proceso " + id + " en ejecución");
			s3.release();
			break;
		case "P2":
			s2.acquire();
			System.out.println("Proceso " + id + " en ejecución");
			s1.release();
			break;
		case "P3":
			s3.acquire();
			System.out.println("Proceso " + id + " en ejecución");
			s2.release();
			break;
		}
	}
}
