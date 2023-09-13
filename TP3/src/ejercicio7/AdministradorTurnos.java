package ejercicio7;

public class AdministradorTurnos {
	private int turnoActual;
	private int cantidadTurnos;

	public AdministradorTurnos(int cantidadTurnos) {
		this.turnoActual = 1;
		this.cantidadTurnos = cantidadTurnos;
	}

	public synchronized boolean imprimir(char letra, int id) {

		boolean exito = false;
		if (turnoActual == id) {
			int i = 0;
			while (i < id) {
				System.out.print(letra);
				i++;
			}
			this.incrementarTurno();
			exito = true;
		}
		return exito;
	}

	private synchronized void incrementarTurno() {
		this.turnoActual++;
		if (this.turnoActual > cantidadTurnos) {
			this.turnoActual = 1;
			System.out.println();
		}
	}
}
