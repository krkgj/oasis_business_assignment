package com.oasisbusiness.assignment.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.oasisbusiness.assignment.api.entity.BookEntity;
import com.oasisbusiness.assignment.api.entity.ContractCompanyEntity;
import com.oasisbusiness.assignment.api.entity.SupplyEntity;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SupplyBookDto 
{	
	/**
	 * 도서 번호
	 */
	@ApiModelProperty(example = "도서 번호")
	private Long seq;
	
	/**
     * 도서 제목
     */
	@ApiModelProperty(example = "도서 제목")
    private String bookTitle;

    /**
     * 도서 종류
     */
	@ApiModelProperty(example = "도서 종류")
    private String category;

    /**
     * 발행일
     */
	@ApiModelProperty(example = "도서 발행일")
    private LocalDate issueDate;

    /**
     * 도서의 양
     */
	@ApiModelProperty(example = "도서 잔고량")
    private Long quantity;
    
    /**
     * 작가
     */
	@ApiModelProperty(example = "도서 작가")
    private String author;

    /**
     * 정가
     */
	@ApiModelProperty(example = "정가")
    private BigDecimal netPrice;
    
    /**
     * 공급가
     */
	@ApiModelProperty(example = "공급가")
    private BigDecimal supplyPrice;
    
    /**
     * 할인율
     */
	@ApiModelProperty(example = "도서 할인율")
    private BigDecimal discountRate;
    
	/**
	 * 공급일자
	 */
	@ApiModelProperty(example = "도서 공급일자")
	private LocalDate supplyDate;
	
    /**
     * 계약 날짜
     */
	@ApiModelProperty(example = "계약 날짜")
    private LocalDate cntrcDate;

    /**
     * 최저가 비율
     */
	@ApiModelProperty(example = "최저가 비율")
    private BigDecimal lwstRate;

    /**
     * 계약 상태 코드
     */
	@ApiModelProperty(example = "계약 상태코드")
    private String statusCode;
    
    public static SupplyBookDto supplyBookDetailBuilder(BookEntity book, SupplyEntity supply, ContractCompanyEntity company)
    {
    	return new SupplyBookDtoBuilder()
    			.seq(book.getSeq())
    			.bookTitle(book.getBookTitle())
    			.category(book.getCategory())
    			.issueDate(book.getIssueDate())
    			.quantity(book.getQuantity())
    			.author(book.getAuthor())
    			.netPrice(book.getNetPrice())
    			.supplyPrice(book.getSupplyPrice())
    			.discountRate(book.getDiscountRate())
    			.supplyDate(supply.getSupplyDate())
    			.cntrcDate(company.getCntrcDate())
    			.lwstRate(company.getLwstRate())
    			.statusCode(company.getStatusCode())
    			.build();
    }
}
