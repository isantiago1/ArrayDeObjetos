package com.example;

/**
 * INICIO
 */

public class App {

	public static void main( String[] args )
	{
		
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
		
		System.out.println("Recorriendo el array de perssonas  ejercicio 1-------------------");
    	for(Persona persn : arrayPersonas)
    		System.out.println(persn.getSalario());
		
    	double suma= 0.0;
    	int totalDePersonas = arrayPersonas.length;
    	double salarioPromedio= 0.0;
    	
    	System.out.println("Recorriendo el array de perssonas  ejercicio 1-------------------");
    	for(Persona persn : arrayPersonas) {
    		suma = suma + persn.getSalario();
			}
		salarioPromedio = suma / totalDePersonas;
		System.out.println("El Salario promedio de las personas es: " + salarioPromedio);
		
		/* Ejercicio nº 2
		Recorrer  el array de personas y calcular el salario promedio por genero
		*/

		// Necesitamos 3 variables segun el sexo (hombre, mujer, otro)
		
		double sumatoriaSalariosHombre = 0.0;
		double sumatoriaSalarioMujer = 0.0;
		double sumatoriaSalarioOtro = 0.0;
		
		int totalGeneroHombre = 0;
		int totalGeneroMujer = 0;
		int totalGeneroOtro = 0;
		
		double salarioPromedioHombres= 0.0;
		double salarioPromedioMujeres= 0.0;
		double salarioPromedioOtros= 0.0;
		
    	System.out.println("Recorriendo el array de perssonas  ejercicio 2-------------------");
    	
    	for(Persona p : arrayPersonas) {
    		if (p.getGenero().equals(Genero.HOMBRE)) {
    			sumatoriaSalariosHombre += p.getSalario();
    			totalGeneroHombre++;
    		} else if  (p.getGenero().equals(Genero.MUJER)) {
    			sumatoriaSalarioMujer += p.getSalario();
    			totalGeneroMujer++;
    		} else {
    			sumatoriaSalarioOtro += p.getSalario();
    			totalGeneroOtro++;
			}
    		
    		salarioPromedioHombres = salarioPromedioHombres / totalGeneroHombre;
    		salarioPromedioMujeres = salarioPromedioMujeres / totalGeneroMujer;
    		salarioPromedioOtros = salarioPromedioOtros / totalGeneroOtro;
    		
    		System.out.println("El Salario promedio de los Hombres es: " + salarioPromedioHombres);
	        System.out.println("El Salario promedio de las Mujeres es: " + salarioPromedioMujeres);
	        System.out.println("El Salario promedio de Otros es: " + salarioPromedioOtros);
    	};		
    }
}
