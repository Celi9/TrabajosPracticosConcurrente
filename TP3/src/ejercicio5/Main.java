package ejercicio5;

public class Main {
	public static void main(String[] args) {

		Surtidor surtidor = new Surtidor(1000, 1000);

		Runnable[] autos = new Runnable[6];
		autos[0] = new Auto(70, 50, "AA 123 AA", "XXXX", "YYYY", 0, surtidor);
		autos[1] = new Auto(60, 50, "BB 123 BB", "XXXX", "YYYY", 0, surtidor);
		autos[2] = new Auto(70, 50, "CC 123 CC", "XXXX", "YYYY", 0, surtidor);
		autos[3] = new Auto(30, 30, "DD 123 DD", "XXXX", "YYYY", 0, surtidor);
		autos[4] = new Auto(40, 40, "EE 123 EE", "XXXX", "YYYY", 0, surtidor);
		autos[5] = new Auto(50, 50, "FF 123 FF", "XXXX", "YYYY", 0, surtidor);

		// Se crean los hilos
		Thread hilosAutos[] = new Thread[6];
		for (int i = 0; i < hilosAutos.length; i++) {
			hilosAutos[i] = new Thread(autos[i]);
		}

		// Se inicializan los hilos
		for (Thread thread : hilosAutos) {
			thread.start();
		}

	}

}
