package com.example;

/**
 * INICIO
 */
public class App {
	
	private static int SIZE;
	public static void main( String[] args )
    {
		if(args.length != 0)
			SIZE = Integer.parseInt(args[0]);
		
        // Para crear un Array de Persona, esta variante crea un Array INMUTABLE!!, es decir no se puede
		// modificar una vez que se ha creado.
    	// ejemplo int[] nombreDelArray
    	
    	Persona[] arrayPersonas = {
    		Persona.builder()
    			.nombre("Ivan")
    			.primerApellido("Santiago")
    			.genero(Genero.HOMBRE)
    			.salario(3000.60)
    			.build(),
    		Persona.builder()
    			.nombre("Maria Jose")
    			.primerApellido("Rodriguez")
    			.salario(2500.50)
    			.genero(Genero.MUJER)
    			.build(),
    		Persona.builder()
    			.nombre("Tamara")
    			.primerApellido("Sanchez")
    			.salario(2800.90)
    			.genero(Genero.MUJER)
    			.build(),
    		Persona.builder()
    			.nombre("Adrian")
    			.primerApellido("Santos")
    			.segundoApellido("Gil")
    			.genero(Genero.HOMBRE)
    			.salario(3000.60)
    			.build()
    	};	
    	
    	/*
    	 * Otra variante (no recomendada) para crear objetos, aunque no es recomendada permite agregar 
    	 * nuevo elementos al Array
    	 * 
    	 */
    	Persona[] arrayPersonasNoRecomendada = new Persona[10];
    	arrayPersonasNoRecomendada[0] = new Persona();
    	arrayPersonasNoRecomendada[0].setNombre("Jessica");
    	
    	/* Que podemos hacer con el Array de Objetos ?
    	 * 1 Recorrerlos y mostrar los elementos por consola
    	 * Como podemos recorrer el array de personas?
    	 * Rta: con un for mejorado
    	 * 
    	 */
    	
    	System.out.println("Recorriendo el array de perssonas -------------------");
    	for(Persona persn : arrayPersonas)
    		System.out.println(persn);
    	
    	/* Agregar una nueva persona al Array de personas NO ES POSIBLE
    	 * 
    	 * Para agregar un elemento a un Array, por ejemplo, si fuese de enteros:
    	 * 
    	 * */
    	
    	int [] arrayDeNumeros = { 1,2,3,4}; // Genera un array inmutable
    	
    	// arrayDeNumeros.push(5); esto no lo permite No existe en Java
    	
    	// arrayDeNumeros[4] = 5; tampoco lo permite da fuera de rango
    	
    	/* Recorrer el array de Personas y almacenar las personas del genero MUJER
    	 * en un un nuevo array que podemos llamar arrayDeMujeres  
    	 */
    	Persona[] arrayDeMujeres = new Persona[SIZE];
    	
    	int indice =0;
    	
    	for(Persona p : arrayPersonas ) {
    		if(p.getGenero().equals(Genero.MUJER))
    			arrayDeMujeres[indice++] = p;
    	}
    	
    	
    	System.out.println("Personas del Genero Mujer ----------");
    	for(Persona mujer : arrayDeMujeres) {
    		if (mujer != null)
    		System.out.println(mujer);
    		else
    			break; // sentencia que rompe el bucle
    	}
    	
    	/* 
    	 * Ejercicio 1: crear una rama nueva
    	 * 
    	 * Recorrer el array de personas y recuperar el salaio promedio
    	 * de todas las personas */
    	
    	// Prueba
    	
    	int[] mi_array_1 = { 22, 24, 29, 33, 6, 1, 44, 5, 66, 77, 99 };
		System.out.println("----------------------------------------");
		System.out.println("Array utilizando length");
		System.out.println("----------------------------------------");
		// la propiedad length nos muestra longitud del array
		for (int i = 0; i < mi_array_1.length; i++) {
			System.out.println("valor de indice " + i + " = " + mi_array_1[i]);
		}
    	
    	
    }
}
