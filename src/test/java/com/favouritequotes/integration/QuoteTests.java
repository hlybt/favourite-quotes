package com.favouritequotes.integration;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.favouritequotes.controller.QuoteController;
import com.favouritequotes.model.Quote;
import com.favouritequotes.repository.QuoteRepository;

@WebMvcTest(QuoteController.class)
public class QuoteTests {

	@Autowired
	MockMvc mockMvc;

	@Autowired
	ObjectMapper objectMapper;

	@MockBean
	QuoteRepository quoteRepository;

	/**
	 * Assert that POST request with a Quote instance on path '/quote' returns
	 * HttpStatus.OK (200).
	 */
	@Test
	public void postQuote_returnsOK() throws Exception {
		this.mockMvc.perform(post("/quote").accept(MediaType.APPLICATION_JSON).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(new Quote()))).andExpect(status().isOk());
	}
}