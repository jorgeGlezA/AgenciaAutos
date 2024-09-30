package crudListaInterface;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomesticos electro1 = new Electrodomesticos("1234", "Licuadora", 300);
		Electrodomesticos electro2 = new Electrodomesticos("1234", "Vatidora", 400);
		Electrodomesticos electro3 = new Electrodomesticos("1234", "Refrigerado", 3400);

		// Se realizan nuevos cambios agregando una lista
		Electrodomesticos electro4 = new Electrodomesticos("1234", "Refrigerado", 3400);
		
		//Se agrega esto para rectificar la nueva rama
		Electrodomesticos electro5 = new Electrodomesticos("1234", "Refrigerado", 3400);
		
		// Instacia de clase --
		LogicaMetodos imp = new LogicaMetodos();
		
		// Utilizar los metodos que hemos desarrollado

		// Guardar

		imp.guardar(electro1);
		imp.guardar(electro2);
		imp.guardar(electro3);

		// Mostrar
		imp.mostrar();

		// Buscar
		// Electrodomesticos registroEncon = null;
		// registroEncon = imp.buscar(1);
		System.out.println("\n" + imp.buscar(1));

		// Editar
		Electrodomesticos registroEncon = null;
		registroEncon = imp.buscar(1);
		registroEncon.setNombre("Refrigerador");
		imp.editar(1, registroEncon);

		// Mostrar
		imp.mostrar();

		// Eliminar
		imp.eliminar(2);

		// Mostrar
		imp.mostrar();

		// Tamaño de la lista
		System.out.println(imp.tamanoLista());

	}

}
