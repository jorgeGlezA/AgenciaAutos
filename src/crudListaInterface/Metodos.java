package crudListaInterface;

public interface Metodos {

	// METODOS --> FUNCIONES (QUE RETORNA ALGO) Y PROCEDIMIENTOS (QUE NO RETORNA NADA)
	
	// ModificadorAcceso valorDeRatorno nombreMetodo (Argumentos o Parametros)
	
	//Declarar los metodos del crud basico
	
	public void guardar(Electrodomesticos electrodomestico);
	
	public void mostrar();
	
	public Electrodomesticos buscar(int indice);
	
	public void editar (int indice, Electrodomesticos electrodomestico);
	
	public void eliminar (int indice);
	
	
}
