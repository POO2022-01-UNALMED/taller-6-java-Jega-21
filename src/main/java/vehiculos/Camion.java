package vehiculos;

// Clase.
public class Camion extends Vehiculo {
	
	// Atributos.
	private int ejes;
	public static int cantCamiones;
	
	// Cosntructor.
	public Camion(String placa, String nombre, double precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		cantCamiones++;
	}
	
	// Getters and Setters.
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
}