package com.tobeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/merhaba")

//istek http://localhost:8080/merhaba olarak gelirse bu sınıfı çalıştır demiş olduk
public class IlkController {

	@GetMapping
	@ResponseBody // bu methoddan dönecek cevap, response'un body'si olsun
	public String deneme() {
		return "Merhaba";
	}

}
