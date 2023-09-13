package ejercicio3;

public class Rueda {
	private boolean disponible;

	public Rueda(boolean disponible) {
		this.disponible = disponible;
	}

	public boolean estaDisponible() {
		return disponible;
	}

	public synchronized void usarRueda(String nombreHamster) {

		this.disponible = false;
		System.out.println("Hamster " + nombreHamster + " está usando la rueda");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hamster " + nombreHamster + " dejó de usar la rueda");
	}

}
