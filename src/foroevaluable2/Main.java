package foroevaluable2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Camiseta camiseta1 = new Camiseta("Camiseta de rayas", Tallaje.L, "Azul marino", 1, 7.95);
		Calcetines calcetines1= new Calcetines ("Calcetines de rayas", Tallaje.M, "Azul marino", 1, 2.95, true);
		Calcetines calcetines2= new Calcetines ("Calcetines de círculos", Tallaje.S, "Azul marino", 1, 2.95, false);
		
		System.out.println(camiseta1.getPrecio());
		System.out.println(calcetines1.getPrecio());
		System.out.println(calcetines2.getPrecio());
	
	}
}
