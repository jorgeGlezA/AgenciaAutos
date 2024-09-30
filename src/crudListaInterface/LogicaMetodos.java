package crudListaInterface;

import java.util.ArrayList;
import java.util.List;

public class LogicaMetodos implements Metodos, Metodos2 {
	
	//Declara lista
	List<Electrodomesticos> lista = new ArrayList<Electrodomesticos>();
	
	@Override
	public void guardar(Electrodomesticos electrodomestico) {
		// TODO Auto-generated method stub
		lista.add(electrodomestico);
		
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(lista);
	}

	@Override
	public Electrodomesticos buscar(int indice) {
		// TODO Auto-generated method stub
		Electrodomesticos electroEncont = null;
		electroEncont = lista.get(indice);
		
		return electroEncont;
	}

	@Override
	public void editar(int indice, Electrodomesticos electrodomestico) {
		// TODO Auto-generated method stub
		lista.set(indice, electrodomestico);
		
	}

	@Override
	public int tamanoLista() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		lista.remove(indice);
		
	}

}
