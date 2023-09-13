package ejercicio5;

public class Auto extends Vehiculo implements Runnable {

	private int reserva;
	private int capacidadMax; // (de litros de combustible)
	private int combustibleDisponible; // (de litros de combustible)
	private Surtidor surtidor;

	public Auto(int capacidadMax, int combustibleDisponible, String patente, String modelo, String marca, int km,
			Surtidor surtidor) {
		super(patente, modelo, marca, km);
		this.reserva = capacidadMax * 15 / 100;
		this.capacidadMax = capacidadMax;
		this.combustibleDisponible = combustibleDisponible;
		this.surtidor = surtidor;
	}

	@Override
	public void run() {

		while (combustibleDisponible > reserva) {
			conducir();
			System.out.println("Auto (" + getPatente() + ") debe recargar combustible.");
			combustibleDisponible += surtidor.cargarCombustible(capacidadMax - reserva, getPatente());
		}
		System.out.println("Auto (" + getPatente() + ") no puede continuar.");
	}

	private void conducir() {

		int aux = combustibleDisponible - reserva;
		try {
			System.out.println("Auto (" + getPatente() + ") conduciendo.");
			Thread.sleep(aux * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		combustibleDisponible -= aux;
	}

}
