package ejercicio2;

public class EnergiaBH {

	private int unidadesEnergia = 10;

	public EnergiaBH() {
	}

	public synchronized int incrementar(int incremento) {
		unidadesEnergia += incremento;
		return unidadesEnergia;
	}

	public synchronized int decrementar(int decremento) {
		unidadesEnergia -= decremento;
		return unidadesEnergia;
	}

	public synchronized int obtenerValor() {
		return unidadesEnergia;
	}

}
