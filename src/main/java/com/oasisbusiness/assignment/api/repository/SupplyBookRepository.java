package com.oasisbusiness.assignment.api.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.oasisbusiness.assignment.api.dto.SupplyBookDto;
import com.oasisbusiness.assignment.api.entity.BookEntity;
import com.oasisbusiness.assignment.api.entity.QBookEntity;
import com.oasisbusiness.assignment.api.entity.QContractCompanyEntity;
import com.oasisbusiness.assignment.api.entity.QSupplyBookEntity;
import com.oasisbusiness.assignment.api.entity.QSupplyEntity;
import com.querydsl.core.QueryResults;
import com.querydsl.core.Tuple;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;


@Repository
@RequiredArgsConstructor
public class SupplyBookRepository
{

	private final JPAQueryFactory query;
	
	/**
	 * @설명 할인율을 적용한 공급도서들을 조회, book, supply, contract_company를 supply_book 테이블을 기준으로 조인
	 * @설명2 BooleanExpression을 이용하여 동적쿼리 작성.
	 * @param discountRate
	 * @return
	 */
	public List<SupplyBookDto> findSupplyBooks(BigDecimal discountRate)
	{
		List<SupplyBookDto> results = new ArrayList<SupplyBookDto>();
		
		QSupplyBookEntity qSupplyBookEntity = QSupplyBookEntity.supplyBookEntity;
		QSupplyEntity qSupplyEntity = QSupplyEntity.supplyEntity;
		QBookEntity qBookEntity = QBookEntity.bookEntity;
		QContractCompanyEntity qContractCompanyEntity = QContractCompanyEntity.contractCompanyEntity;
		
		QueryResults<Tuple> queryResult = query.select(qBookEntity, qSupplyEntity, qContractCompanyEntity)
			.from(qSupplyBookEntity)
			.innerJoin(qSupplyBookEntity.book, qBookEntity)
			.innerJoin(qSupplyBookEntity.supply, qSupplyEntity)
			.innerJoin(qSupplyEntity.contractCompany, qContractCompanyEntity)
			.where(eqDiscountRate(discountRate))
			.fetchResults();
		
		if(queryResult.getResults().isEmpty())
			return null;
		
		queryResult.getResults().stream().forEach(result -> results.add(
				SupplyBookDto.supplyBookDetailBuilder(result.get(qBookEntity), result.get(qSupplyEntity), result.get(qContractCompanyEntity))));
		
		return results;
	}
	
	private BooleanExpression eqDiscountRate(BigDecimal discountRate)
	{
		if(BigDecimal.ZERO.compareTo(discountRate) >= 0)
			return null;
		
		return QBookEntity.bookEntity.discountRate.goe(discountRate);
	}
}
