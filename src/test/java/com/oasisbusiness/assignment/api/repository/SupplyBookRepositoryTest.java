package com.oasisbusiness.assignment.api.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SupplyBookRepositoryTest 
{
	@Mock
	SupplyBookRepository supplyBookRepository;

	@Test
	@DisplayName("공급도서 상세조회")
	void testFindSupptlyBooks() {
//		given(supplyBookRepository.findSupplyBooks(BigDecimal.ZERO).size()).willReturn(3);
		assertEquals(3, supplyBookRepository.findSupplyBooks(BigDecimal.ZERO).size()); // H2BASE의 SQL이 실행되지 않음으로 0을 리턴함
	}

}
