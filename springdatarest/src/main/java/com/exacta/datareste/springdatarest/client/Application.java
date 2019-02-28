package com.exacta.datareste.springdatarest.client;

import org.springframework.web.client.RestTemplate;

import com.exacta.datareste.springdatarest.client.retorno.Quote;

public class Application {

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		System.out.println(quote.toString());
	}

}
