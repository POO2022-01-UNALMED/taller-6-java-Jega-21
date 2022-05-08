package vehiculos;

// Clase.
public class Camioneta extends Vehiculo {
	
	// Atributos.
	private boolean volco;
	public static int cantCamionetas;
	
	// Constructor.
	public Camioneta(String placa, int puertas, String nombre, double precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantCamionetas ++;
	}
		
	// Getters and Setters.
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}

}