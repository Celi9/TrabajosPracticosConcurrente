package ejercicio4;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {

		int cantClientes = Integer.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad de clientes: "));
		int cantImpresoras = Integer.valueOf(JOptionPane.showInputDialog("Indique la cantidad de impresoras: "));

		GestorImpresoras gestor = new GestorImpresoras(cantImpresoras);
		Thread[] clientes = new Thread[cantClientes];

		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente(gestor, "Cliente " + i);
		}

		for (Thread thread : clientes) {
			thread.start();
		}
	}
}
