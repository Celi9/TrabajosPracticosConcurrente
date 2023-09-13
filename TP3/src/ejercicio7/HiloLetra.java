package ejercicio7;

public class HiloLetra implements Runnable {

	private int id;
	private char letra;
	private AdministradorTurnos adm;

	public HiloLetra(int id, char letra, AdministradorTurnos adm) {
		this.id = id;
		this.letra = letra;
		this.adm = adm;
	}

	@Override
	public void run() {
		int i = 0;
		boolean exito = false;

		while (i < 20) {
			exito = adm.imprimir(letra, id);
			if (exito)
				i++;
		}
	}
}
