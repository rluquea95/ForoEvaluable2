package foroevaluable2;

public class Camiseta extends Ropa{
	
	public Camiseta(String nombre, Tallaje talla, String color, int cantidad, double precio) {
		super(nombre, talla, color, cantidad, precio);
	}

	@Override
	public void descripcion() {
		System.out.println("Composición 100% algodón.");
	}

	@Override
	public void cuidados() {
		System.out.println("Lavar del revés en frío (30ºC máximo).");
	}
}
