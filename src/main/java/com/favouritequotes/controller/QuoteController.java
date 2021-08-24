package com.favouritequotes.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.favouritequotes.model.Quote;
import com.favouritequotes.repository.QuoteRepository;

@RestController
public class QuoteController {
	private final QuoteRepository quoteRepository;
	
	public QuoteController(QuoteRepository quoteRepository) {
		this.quoteRepository = quoteRepository;
	}
	
	@PostMapping("/quote")
	public Quote createQuote(@RequestBody Quote quote) {
		return quoteRepository.save(quote);
	}
}