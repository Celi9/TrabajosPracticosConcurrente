package ejercicio2;

public class MaquinaExpendedora {

	private int ticketsVendidos;

	public MaquinaExpendedora() {
		ticketsVendidos = 0;
	}

	public synchronized void comprarTicket(String pasajero) {
		ticketsVendidos++;
		System.out.println(pasajero + " compró un ticket");
		System.out.println("Tickets vendidos: " + ticketsVendidos);
	}
}
