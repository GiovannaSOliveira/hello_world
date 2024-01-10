package com.helloworld.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringAtividade01 {

	@GetMapping("/helloworld")
	public String helloworld() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsmgen() {
		return "Mentalidades: Orientação ao futuro, Responsabilidade pessoal, Mentalidade de crescimento, Persistência.  Habilidades: Trabalho em equipe, Atenção aos detalhes, Proatividade, Comunicação.";
	}
	
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Objetivos de aprendizagem semanal: Avanço para A2 francês, Revisar MySQL e Java, perder dependência ao cookbook.";
	}
}
