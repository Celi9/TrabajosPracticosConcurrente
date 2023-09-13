package ejercicio6;

import java.util.Random;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int cantElementos = Integer
				.valueOf(JOptionPane.showInputDialog("Ingrese el número de elementos del arreglo: "));
		int cantHilos = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el número hilos: "));

		int[] numeros = new int[cantElementos];
		int longitudSegmento = cantElementos / cantHilos;
		int aux1 = 0;
		int aux2 = longitudSegmento;
		Thread[] hilos = new Thread[cantHilos];

		// Genera los numeros del arreglo
		Random rnd = new Random();
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (rnd.nextDouble() * 10 + 1);
		}
		SumadorParcial.setArreglo(numeros);

		// Se crean los hilos
		Runnable sumador;
		for (int i = 0; i < cantHilos; i++) {

			if (i == cantHilos - 1) {
				sumador = new SumadorParcial(aux1, numeros.length - 1);
			} else {
				sumador = new SumadorParcial(aux1, aux2);
			}

			hilos[i] = new Thread(sumador);
			aux1 = aux2 + 1;
			aux2 += longitudSegmento;
		}

		// Se inicializan los hilos
		for (int i = 0; i < cantHilos; i++) {
			hilos[i].start();
			try {
				hilos[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Se efectua la suma secuencial de los numeros del arreglo
		int suma = 0;
		for (int numero : numeros) {
			suma += numero;
		}

		System.out.println("Suma parcial: " + SumadorParcial.getTotal());
		System.out.println("Suma total: " + suma);
	}
}
