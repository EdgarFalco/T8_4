package main;

import objetos.Serie;

public class Ejercicio4App {

	public static void main(String[] args) {
		
		//Creamos un objeto serie con el constructor por defecto
		Serie serie1 = new Serie();
		System.out.println(serie1.toString());
		
		//Creamos otro objeto con el constructor titulo y creador
		Serie serie2 = new Serie("Piratas", "Pablo Molina");
		System.out.println(serie2.toString());
		
		//Creamos otro objeto con todos los atributos menos entregado
		Serie serie3 = new Serie("Piratas", 10,"piratas", "Pablo Molina");
		System.out.println(serie3.toString());
	}
}
