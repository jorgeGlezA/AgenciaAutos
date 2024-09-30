package crudListaInterface;

public class Electrodomesticos {
	//ATRIBUTOS
	private String clave;
	private String nombre;
	private float precio;
	//CONSTRUCTOR VACIO
	public Electrodomesticos() {
	}
	//CONSTRUCTOR CON ATRIBUTOS
	public Electrodomesticos(String clave, String nombre, float precio) {
		this.clave = clave;
		this.nombre = nombre;
		this.precio = precio;
	}
	// SOBRE CARGA DE MOTODOS
	@Override
	public String toString() {
		return "Electrodomesticos [clave=" + clave + ", nombre=" + nombre + ", precio=" + precio + "]\n";
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
