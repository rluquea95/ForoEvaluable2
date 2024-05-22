package foroevaluable2;

public abstract class Ropa {
	private String nombre, color;
	private Tallaje talla;
	private int cantidad;
	private double precio;
	
	public Ropa(String nombre, Tallaje talla, String color, int cantidad, double precio) {
		this.nombre=nombre;
		this.talla=talla;
		this.color=color;
		this.cantidad=cantidad;
		this.precio=precio;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Tallaje getTalla() {
		return talla;
	}

	public void setTalla(Tallaje talla) {
		this.talla = talla;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public abstract void descripcion();
	public abstract void cuidados();
}
