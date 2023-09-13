package ejercicio2;

public class Main {

	public static void main(String[] args) {
//		Energia e = new Energia();
		EnergiaBH e = new EnergiaBH();
		Runnable s = new Entidad(true, e);
		Runnable c = new Entidad(false, e);

		Thread sanador = new Thread(s);
		Thread criaturaOscura = new Thread(c);

		sanador.start();
		criaturaOscura.start();
	}
}
