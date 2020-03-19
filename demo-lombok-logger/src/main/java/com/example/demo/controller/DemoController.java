package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class DemoController {
	
	@GetMapping(value = "/slf4j")
	public String pintandoLogger() {
		log.info("Inicio del pintado de Log con Lombok @Slf4j");
		return "Hola Lombok con Logger @Slf4j";
	}

}
