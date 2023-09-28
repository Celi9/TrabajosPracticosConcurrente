package ejercicio1;

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
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			tren.terminarRecorrido();
		}
	}
}
