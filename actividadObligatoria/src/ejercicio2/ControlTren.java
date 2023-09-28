package ejercicio2;

public class ControlTren extends Thread {

	private Tren tren;

	public ControlTren(Tren tren) {
		this.tren = tren;
	}

	@Override
	public void run() {

		while (true) {
			tren.habilitarTren();
			tren.iniciarRecorrido();
			try {
				Thread.sleep(1000); // simula la duracion del recorrido del tren
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tren.terminarRecorrido();
		}
	}
}
