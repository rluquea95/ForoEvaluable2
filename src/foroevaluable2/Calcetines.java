package foroevaluable2;

public class Calcetines extends Ropa implements Personalizacion{

	private boolean personaliza=false;
	
	public Calcetines(String nombre, Tallaje talla, String color, int cantidad, double precio, boolean personaliza) {
		super(nombre, talla, color, cantidad, precio);
		this.personaliza=personaliza;
		agregaDisenio();
	}

	@Override
	public void descripcion() {
		System.out.println("Algodón (85%), mezcla de poliamida (12%) y elastano (3%)");
	}

	@Override
	public void cuidados() {
		System.out.println("Lavar del revés en agua fría para mantener la forma y el tamaño.");
	}

	@Override
	public void agregaDisenio() {
		if(personaliza) setPrecio(getPrecio()+3);
	}

}
