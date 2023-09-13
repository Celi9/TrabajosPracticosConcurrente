package ejercicio2;

public class Entidad implements Runnable {

	private int valor = 3;
	private boolean esSanador;
//	private Energia e;
	private EnergiaBH e;

//	public Entidad(boolean tipoEntidad, Energia e) {
//		this.esSanador = tipoEntidad;
//		this.e = e;
//	}

	public Entidad(boolean tipoEntidad, EnergiaBH e) {
		this.esSanador = tipoEntidad;
		this.e = e;
	}

	@Override
	public void run() {

		while (true) {
			if (esSanador) {
				revitalizar();
			} else {
				drenar();
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private void drenar() {
		int aux = this.e.decrementar(valor);
		System.out.println("Criatura oscura drenó -" + valor + " unidades de energia.");
		System.out.println("Criatura oscura: energía disponible (" + aux + ")");
	}

	private void revitalizar() {
		int aux = this.e.incrementar(valor);
		System.out.println("Sanador revitalizó +" + valor + " unidades de energia.");
		System.out.println("Sanador: energía disponible (" + aux + ")");
	}

}
