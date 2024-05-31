package com.example;

/**
 * INICIO
 */

public class App {

	public static void main(String[] args) {

		// Queremos crear un Array que contenga tanto personas como coches en el mismo.

		// necesitamos un array para los dos tipos de datos, tiene que ser de tipo Objet

		Object[] personasYCoches = {

				Persona.builder().nombre("Rosa").primerApellido("Castro").genero(Genero.MUJER).build(),
				Persona.builder().nombre("Marly").genero(Genero.MUJER).build(),
				Coche.builder().marca("Audi").modelo("R2").build(),
				Coche.builder().marca("Mercedes").modelo("AMG").build() };

		// Recorrer el Array y operar con los elementos segun el tipo 
		// for mejorado
		
		for(Object object : personasYCoches) {
			
			// Tengo que determinar si el objeto es una instancia de Persona o Coche
			// para lo cual se utiliza el operador instanceof, que comprueba si un objeto es una instancia
			// de algun tipo
			
			if(object instanceof Persona) {
				Persona p = (Persona) object; // convertir 
				System.out.println("Nombre de la persona: " + p.getNombre());
				
			} else if(object instanceof Coche) {
				Coche c = (Coche) object;
				System.out.println("La marca del coche es: " + c.getMarca());
				System.out.println("El pais del fabricante: " + Coche.paisDelFabricante);
				
			}
			
		}
		
		
		
	}
}
