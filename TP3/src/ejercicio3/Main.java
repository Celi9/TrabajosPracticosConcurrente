package ejercicio3;

public class Main {
	public static void main(String[] args) {

		Hamaca hamaca = new Hamaca(true);
		Plato plato = new Plato(true);
		Rueda rueda = new Rueda(true);
		Thread[] hamsters = new Thread[6];

		Runnable hamster1 = new Hamster("Aldi", hamaca, plato, rueda);
		Runnable hamster2 = new Hamster("Celi", hamaca, plato, rueda);
		Runnable hamster3 = new Hamster("Jesus", hamaca, plato, rueda);
		Runnable hamster4 = new Hamster("Jere", hamaca, plato, rueda);
		Runnable hamster5 = new Hamster("Facu", hamaca, plato, rueda);
		Runnable hamster6 = new Hamster("Cris", hamaca, plato, rueda);

		hamsters[0] = new Thread(hamster1);
		hamsters[1] = new Thread(hamster2);
		hamsters[2] = new Thread(hamster3);
		hamsters[3] = new Thread(hamster4);
		hamsters[4] = new Thread(hamster5);
		hamsters[5] = new Thread(hamster6);

		for (Thread hamster : hamsters) {
			hamster.start();
		}
	}

}
