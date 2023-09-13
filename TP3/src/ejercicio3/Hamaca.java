package ejercicio3;

public class Hamaca {
	private boolean disponible;

	public Hamaca(boolean disponible) {
		this.disponible = disponible;
	}

	public boolean estaDisponible() {
		return disponible;
	}

	public synchronized void usarHamaca(String nombreHamster) {

		this.disponible = false;
		System.out.println("Hamster " + nombreHamster + " está usando la hamaca");
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hamster " + nombreHamster + " dejó de usar la hamaca");
	}

}
