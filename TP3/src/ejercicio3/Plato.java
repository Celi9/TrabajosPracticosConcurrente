package ejercicio3;

public class Plato {
	private boolean disponible;

	public Plato(boolean disponible) {
		this.disponible = disponible;
	}

	public boolean estaDisponible() {
		return disponible;
	}

	public synchronized void usarPlato(String nombreHamster) {

		this.disponible = false;
		System.out.println("Hamster " + nombreHamster + " está comiendo");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hamster " + nombreHamster + " terminó de comer");
	}

}
