package com.oasisbusiness.assignment.api.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.oasisbusiness.assignment.api.dto.SupplyBookDto;
import com.oasisbusiness.assignment.api.entity.BookEntity;
import com.oasisbusiness.assignment.api.entity.QBookEntity;
import com.oasisbusiness.assignment.api.entity.QContractCompanyEntity;
import com.oasisbusiness.assignment.api.entity.QSupplyBookEntity;
import com.oasisbusiness.assignment.api.entity.QSupplyEntity;
import com.oasisbusiness.assignment.api.repository.SupplyBookRepository;
import com.oasisbusiness.assignment.utils.Code;
import com.oasisbusiness.assignment.utils.ResultDto;
import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SupplyBookService 
{
	private final SupplyBookRepository supplyBookRepository;
	
	/**
	 * @설명 discountRate가 ZERO이면 모든 공급도서를 조회하고, ZERO 초과면 할인율을 적용한 공급도서들이 조회됨.
	 * @param discountRate(할인율)
	 * @return ResultDto(결과 DTO)
	 */
	public ResultDto findSupplyBook(BigDecimal discountRate)
	{
		List<SupplyBookDto> results = supplyBookRepository.findSupplyBooks(discountRate);
		
		if(results == null)
			return new ResultDto(Code.RESULT_EMPTY, "Fail");
		
		return new ResultDto(Code.RESULT_OK, "OK", results);
	}
}