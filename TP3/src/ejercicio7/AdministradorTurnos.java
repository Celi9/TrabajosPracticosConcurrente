package ejercicio7;

public class AdministradorTurnos {
	private int turnoActual;
	private int cantidadTurnos;

	public AdministradorTurnos(int cantidadTurnos) {
		this.turnoActual = 1;
		this.cantidadTurnos = cantidadTurnos;
	}

	public synchronized boolean esTurno(int turno) {
		return this.turnoActual == turno;
	}

	public synchronized void incrementarTurno() {
		this.turnoActual++;
		if (this.turnoActual > cantidadTurnos) {
			this.turnoActual = 1;
//			System.out.println();
		}
	}
}
