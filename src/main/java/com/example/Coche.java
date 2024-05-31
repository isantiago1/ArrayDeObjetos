package com.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

public class Coche {
	private String marca;
	private String modelo;
	
	public static final String paisDelFabricante = "Alemania"; // vive en el plano de la Clase, no hace falta crear un objeto
}


