package ejercicio7;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int repSecuencia = Integer
				.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad de repeticiones de la secuencia: "));
		int cantLetras = Integer.valueOf(JOptionPane.showInputDialog("Ingrese el número letras: "));

		HiloLetra.setRepSecuencia(repSecuencia);
		AdministradorTurnos adm = new AdministradorTurnos(cantLetras);

		Runnable letras[] = new Runnable[cantLetras];
		String letra;
		int repLetra;

		JOptionPane.showMessageDialog(null, "A continuación ingrese las letras en orden...");
		for (int i = 0; i < letras.length; i++) {
			letra = JOptionPane.showInputDialog("Ingrese una letra");
			repLetra = Integer.valueOf(JOptionPane.showInputDialog("Indique la cantidad de repeticiones de la letra"));
			letras[i] = new HiloLetra(i + 1, repLetra, letra.charAt(0), adm);
		}

		Thread hilosLetras[] = new Thread[cantLetras];

		for (int i = 0; i < hilosLetras.length; i++) {
			hilosLetras[i] = new Thread(letras[i]);
		}

		for (int i = 0; i < hilosLetras.length; i++) {
			hilosLetras[i].start();
		}

	}
}
