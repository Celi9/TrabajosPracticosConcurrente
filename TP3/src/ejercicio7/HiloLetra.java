package ejercicio7;

public class HiloLetra implements Runnable {

	private static int repSecuencia;
	private int turno;
	private int repLetra;
	private char letra;
	private AdministradorTurnos adm;

	public HiloLetra(int turno, int repLetra, char letra, AdministradorTurnos adm) {
		this.turno = turno;
		this.letra = letra;
		this.adm = adm;
		this.repLetra = repLetra;
	}

	@Override
	public void run() {
		int i = 0;

		while (i < repSecuencia) {
			if (adm.esTurno(turno)) {
				for (int j = 0; j < repLetra; j++) {
					System.out.print(letra);
				}
				adm.incrementarTurno();
				i++;
			}
		}
	}

	public static void setRepSecuencia(int cantRepeticiones) {
		repSecuencia = cantRepeticiones;
	}
}
