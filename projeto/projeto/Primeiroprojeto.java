package com.primeiroprojeto.projeto.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projeto")
@CrossOrigin("*")
public class Primeiroprojeto {
	
	@GetMapping
	public String getHistoria() {
		return "Termos grupo para nos apoiar é muito importante, para mim o mais importante dentre eles é a familia que te apoia desde o inicio da vida até o fim dela. Não conseguiria escolher apenas uma história para exemplificar a importancia deles para mim, porque existem muitas, eles me apoiaram a cada decisão e passo da minha trajetória até aqui tornando elas mais faceis e possiveis.";
	}

}
