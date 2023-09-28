package ejercicio1;

public class SynchronizedObjectCounter {

	private int c = 0;

	public void increment() {
		synchronized (Integer.valueOf(c)) {
			c++;
		} // Este elemento debe ser casteado a Integer
	}

	public void decrement() {
		synchronized (this) {
			c--;
		}
	}

	public int value() {
		return c;
	}

}
