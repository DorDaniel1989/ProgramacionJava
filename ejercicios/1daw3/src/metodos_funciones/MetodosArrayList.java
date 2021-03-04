package metodos_funciones;

import java.util.ArrayList;

public class MetodosArrayList {

	public static void main(String[]arg) {
		
	
	
	ArrayList<Integer> ListaNumeros = new ArrayList<Integer>();
	
	ListaNumeros.add(1);
	ListaNumeros.add(2);
	ListaNumeros.add(3);
	ListaNumeros.add(4);
	ListaNumeros.add(5);
	ListaNumeros.add(6);
	ListaNumeros.add(7);
	ListaNumeros.add(8);
	ListaNumeros.add(9);
	ListaNumeros.add(10);
	
	int j=3;
	ListaNumeros.remove(j);//ELIMINA EL CUARTO VALOR
	
	
	if(ListaNumeros.contains(11))
			System.out.println("esta el numero");
	else
		System.out.println("No esta");
	
	//(posicion,valor)
	ListaNumeros.add(2,7);//añade el valor a la posicion,  todo lo demas se corre
	ListaNumeros.set(3,0);//Actualiza el valor de la posicion
	
	
	for(int i=0;i<ListaNumeros.size();i++) {
		System.out.print(ListaNumeros.get(i)+"/");
	}
	
	ListaNumeros.clear();//Elimina todos los objetos del array
	
	/*
	ArrayList Mezcla = new ArrayList();
	
	Mezcla.add("hola");
	Mezcla.add(1);
	Mezcla.add("eyyy");
	Mezcla.add(2);
	Mezcla.add("que tal?");
	
	System.out.println();
	for(int i=0;i<Mezcla.size();i++) {
		System.out.print(Mezcla.get(i)+"/");
	}
      System.out.println();
	System.out.println(Mezcla.indexOf("que tal?"));   //indexOf devuelve la posicion del objeto en el array
	*/
	}
	
}