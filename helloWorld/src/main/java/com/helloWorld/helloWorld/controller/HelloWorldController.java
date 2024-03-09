package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String helloWorld( ) {
		return "Hello World!!!";
	}


@GetMapping("/bsm")
public List<String> bsmList() {
    List<String> bsm = Arrays.asList(
    		"Responsabilidade Pessoal", 
    		"Persistência", 
    		"Mentalidade de Crescimento"
    		);
    return bsm;
}

@GetMapping("/objetivos")
public List<String> learningObjectives() {
    List<String> objetivos = Arrays.asList(
            "Aprender SpringBoot",
            "Praticar estrutura MVC",
            "Aprimorar lógica de programação"
    );
    return objetivos;
}
}