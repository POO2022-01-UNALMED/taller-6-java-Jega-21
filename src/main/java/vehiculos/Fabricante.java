package vehiculos;
import java.util.ArrayList;

// Clase.
public class Fabricante {
	
	// Atributos.
	private String nombre;
	private Pais pais;
	int cantidad;
	static final ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	// Constructor.
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		this.cantidad++;
		Fabricante.fabricantes.add(this);
	}
	
	// Getters and Setters.
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	// Metodos.
	public static Fabricante fabricaMayorVentas() {
		Fabricante masCant = fabricantes.get(0);
		for(Fabricante fabricante: fabricantes) {
			if(masCant.cantidad > fabricante.cantidad) {
				masCant = fabricante;
			}
		}
		return masCant;
	}
	
}