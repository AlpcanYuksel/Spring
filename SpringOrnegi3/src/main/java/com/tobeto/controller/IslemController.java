package com.tobeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hesap")
public class IslemController {

	// http://localhost:8080/hesap?sayi1=5&sayi2=10
	// yukarıdaki linkten, parametre olarak sayi1 ve sayi2 verilip, çağrılabilir
	@GetMapping
	@ResponseBody
	public int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;

	}

}

//Ödev: 
//Yeni bir web özelliği olan spring boot projesi oluştur. 
//İçine de dört işlem yapan bir de controller yazın
//Not: Ekstra isteyenler, sıfıra bölme yapılmak istendiğinde, hata vermek yerine
//bunu ekrana yazan kodu gösterin
