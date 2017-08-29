package geometria;

public class Circulo {

	private Punto centro;
	private double radio;

	public Circulo(final Punto punto, final double radio) {
		this.centro = punto;
		this.radio = radio;
	}

	public Circulo(final double x, final double y, final double radio) {
		centro = new Punto(x, y);
		this.radio = radio;
	}

	public boolean perteneceAlCirculo(final Punto punto) {
		return this.centro.distanciaHasta(punto) <= this.radio;
	}
	
	public boolean intersectaCon(final Circulo that) {
		return this.centro.distanciaHasta(that.centro) <= (this.radio + that.radio);
	}
}
