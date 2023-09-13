package ejercicio3;

public class Hamster implements Runnable {
	private String nombre;
	private Hamaca hamaca;
	private Plato plato;
	private Rueda rueda;

	public Hamster(String nombre, Hamaca hamaca, Plato plato, Rueda rueda) {
		this.nombre = nombre;
		this.hamaca = hamaca;
		this.plato = plato;
		this.rueda = rueda;
	}

	@Override
	public void run() {
		while (true) {
			int accion = (int) (Math.random() * (3 + 1));

			switch (accion) {
			case 1:
				plato.usarPlato(nombre);
				break;
			case 2:
				hamaca.usarHamaca(nombre);
				break;
			case 3:
				rueda.usarRueda(nombre);
				break;

			default:
				break;
			}
		}

	}

}
