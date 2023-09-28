package ejercicio1;

public class main {

	public static void main(String[] args) {

//		SynchronizedCounter counter = new SynchronizedCounter(); // inciso a
		SynchronizedObjectCounter counter = new SynchronizedObjectCounter(); // inciso b

		Hilo h1 = new Hilo("Hilo1", counter);
		Hilo h2 = new Hilo("Hilo2", counter);

		h1.start();
		h2.start();

	}

}
