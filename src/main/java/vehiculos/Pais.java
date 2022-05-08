package vehiculos;
import java.util.ArrayList;

// Clase.
public class Pais {
	
	// Atributos.
	private String nombre;
	int cantidad;
	static final ArrayList<Pais> paises = new ArrayList<Pais>();
	
	// Constructor.
	public Pais(String nombre) {
		this.nombre = nombre;
		this.cantidad ++;
		Pais.paises.add(this);
	}
	
	// Getters and Setters.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	// Metodos.
	public static Pais paisMasVendedor() {
		Pais masCant = paises.get(0);
		for(Pais pais: paises) {
			if(masCant.cantidad > pais.cantidad) {
				masCant = pais;
			}
		}
		return masCant;
	}
	
}