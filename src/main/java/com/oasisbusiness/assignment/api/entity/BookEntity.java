package com.oasisbusiness.assignment.api.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.oasisbusiness.assignment.api.dto.BookDto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "book")
public class BookEntity 
{
	/**
	 * 도서 번호
	 */
	@Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(example = "도서 번호")
    private Long seq;

    /**
     * 도서 제목
     */
    @Column(name = "book_title")
	@ApiModelProperty(example = "도서 제목")
    private String bookTitle;

    /**
     * 도서 종류
     */
	@ApiModelProperty(example = "도서 종류")
    @Column(name = "category")
    private String category;

    /**
     * 발행일
     */
	@ApiModelProperty(example = "도서 발행일")
    @Column(name = "issue_date")
    private LocalDate issueDate;

    /**
     * 도서의 양
     */
	@ApiModelProperty(example = "도서 잔고량")
    @Column(name = "quantity")
    private Long quantity;
    
    /**
     * 작가
     */
	@ApiModelProperty(example = "도서 작가")
    @Column(name = "author")
    private String author;

    /**
     * 정가
     */
	@ApiModelProperty(example = "도서 정가")
    @Column(name = "net_price")
    private BigDecimal netPrice;
    
    /**
     * 공급가
     */
	@ApiModelProperty(example = "도서 공급가")
    @Column(name = "supply_price")
    private BigDecimal supplyPrice;
    
    /**
     * 할인율
     */
    @Column(name = "discount_rate")
	@ApiModelProperty(example = "도서 할인율")
    private BigDecimal discountRate;
    
    @OneToMany(mappedBy = "book")
    private List<SupplyBookEntity> supplyBooks = new ArrayList<SupplyBookEntity>();
    
    public static BookEntity dto2EntityBuilder(BookDto bookDto)
    {
    	return new BookEntityBuilder()
       			.seq(bookDto.getSeq())
    			.bookTitle(bookDto.getBookTitle())
    			.category(bookDto.getCategory())
    			.issueDate(bookDto.getIssueDate())
    			.quantity(bookDto.getQuantity())
    			.author(bookDto.getAuthor())
    			.netPrice(bookDto.getNetPrice())
    			.supplyPrice(bookDto.getSupplyPrice())
    			.discountRate(bookDto.getDiscountRate())
    			.build();
    }
}
