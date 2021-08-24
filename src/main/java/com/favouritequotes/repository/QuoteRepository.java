package com.favouritequotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.favouritequotes.model.Quote;

public interface QuoteRepository extends JpaRepository<Quote, Long> {

}

