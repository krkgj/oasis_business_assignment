package com.oasisbusiness.assignment.api.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.oasisbusiness.assignment.api.entity.BookEntity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDto
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
	@ApiModelProperty(example = "도서 정가")
    private BigDecimal netPrice;
    
    /**
     * 공급가
     */
	@ApiModelProperty(example = "도서 공급가")
    private BigDecimal supplyPrice;
    
    /**
     * 할인율
     */
	@ApiModelProperty(example = "도서 할인율")
    private BigDecimal discountRate;
    
    public static BookDto entity2DtoBuilder(BookEntity bookEntity)
    {
    	return new BookDtoBuilder()
       			.seq(bookEntity.getSeq())
    			.bookTitle(bookEntity.getBookTitle())
    			.category(bookEntity.getCategory())
    			.issueDate(bookEntity.getIssueDate())
    			.quantity(bookEntity.getQuantity())
    			.author(bookEntity.getAuthor())
    			.netPrice(bookEntity.getNetPrice())
    			.supplyPrice(bookEntity.getSupplyPrice())
    			.discountRate(bookEntity.getDiscountRate())
    			.build();
    }
}
