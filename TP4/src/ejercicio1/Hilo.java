package ejercicio1;

import java.util.Random;

public class Hilo extends Thread {

//	private SynchronizedCounter contador; // inciso a
	private SynchronizedObjectCounter contador; // inciso b

//	public Hilo(String nombre, SynchronizedCounter contador) { // inciso a
//		super(nombre);
//		this.contador = contador;
//	}

	public Hilo(String nombre, SynchronizedObjectCounter contador) { // inciso b
		super(nombre);
		this.contador = contador;
	}

	public void run() {
		int i = 0;

		while (i < 10) {
			if (i % 2 == 0) {
				System.out.println(currentThread().getName() + " incrementa");
				contador.increment();
			} else {
				System.out.println(currentThread().getName() + " decrementa");
				contador.decrement();
			}
			System.out.println(currentThread().getName() + ": " + contador.value());
			i++;
		}
	}

}
