package com.imcrec.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imcrec.api.model.Imc;

@RestController
@RequestMapping("/imc")
public class IMCController {
	
	@GetMapping
	public String calcularIMC(@RequestBody Imc imc) {
		new Imc(imc.getPeso(),imc.getAltura());
		return imc.retornaIMC();
	}
}
