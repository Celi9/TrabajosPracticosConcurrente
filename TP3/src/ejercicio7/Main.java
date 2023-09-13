package ejercicio7;

public class Main {

	public static void main(String[] args) {
		AdministradorTurnos adm = new AdministradorTurnos(3);
		Runnable a = new HiloLetra(1, 'A', adm);
		Runnable b = new HiloLetra(2, 'B', adm);
		Runnable c = new HiloLetra(3, 'C', adm);

		Thread letraA = new Thread(a);
		Thread letraB = new Thread(b);
		Thread letraC = new Thread(c);

		letraA.start();
		letraB.start();
		letraC.start();
	}
}
