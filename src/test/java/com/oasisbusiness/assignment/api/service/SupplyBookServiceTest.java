package com.oasisbusiness.assignment.api.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;

import com.oasisbusiness.assignment.api.repository.SupplyBookRepository;

class SupplyBookServiceTest 
{
	@Autowired
	SupplyBookService supplyBookservice;
	
	@Mock
	SupplyBookRepository supplyBookRepository;

	@Test
	void testFindSupplyBook() {
		supplyBookservice.findSupplyBook(BigDecimal.ZERO).getResult();
	}

}
