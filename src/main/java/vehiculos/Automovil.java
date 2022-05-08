package vehiculos;

// Clase.
public class Automovil extends Vehiculo {
	
	// Atributos.
	private int puestos;
	public static int cantAutomoviles;
	
	// Constructor.
	public Automovil(String placa, String nombre, double precio, int peso, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantAutomoviles++;
	}
	
	// Getters and Setters.
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
		
}