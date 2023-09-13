package ejercicio2;

public class Energia {

	private int unidadesEnergia = 10;

	public Energia() {
	}

	public void incrementar(int incremento) {
		unidadesEnergia += incremento;
	}

	public void decrementar(int decremento) {
		unidadesEnergia -= decremento;
	}

	public int obtenerValor() {
		return unidadesEnergia;
	}

}
