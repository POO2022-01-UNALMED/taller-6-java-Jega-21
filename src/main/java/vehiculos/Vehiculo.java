package vehiculos;
import java.util.ArrayList;

// Clase.
public class Vehiculo {
	
	// Atributos.
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private double precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	public static int cantidadVehiculos;
	public static ArrayList<Vehiculo> vehiculos;
	static {
		vehiculos = new ArrayList<>();
	}
	
	// Constructor.
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, double precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.traccion = traccion;
		this.fabricante = fabricante;
		vehiculos.add(this);
		cantidadVehiculos++;
	}
	
	// Getters and Setters.
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public static int getCantVehiculos() {
		return cantidadVehiculos;
	}
	public static void setCantVehiculos(int cantidadVehiculos) {
		Vehiculo.cantidadVehiculos = cantidadVehiculos;
	}
	
	// Metodos.
	public static String vehiculosPorTipo() {
		return "Automoviles: " + Automovil.cantAutomoviles + "\n" + "Camionestas: " + Camioneta.cantCamionetas + "\n" + "Camiones: " + Camion.cantCamiones;
	}
	
}