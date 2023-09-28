package ejercicio3;

public class Main {

	public static void main(String[] args) {

		Sincronizador sync = new Sincronizador();

		Thread p1 = new Proceso(sync, "P1");
		Thread p2 = new Proceso(sync, "P2");
		Thread p3 = new Proceso(sync, "P3");

		p1.start();
		p2.start();
		p3.start();

	}

}
