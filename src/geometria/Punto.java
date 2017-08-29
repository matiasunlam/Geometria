package geometria;

public class Punto {
	private double x;
	private double y;

	public Punto(final double x, final double y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "(" + this.x + "," + this.y + ")";
	}

	public double distanciaHasta(Punto that) {
		return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
	}

}
