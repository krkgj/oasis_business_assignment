package com.oasisbusiness.assignment.api.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "supply_book")
public class SupplyBookEntity 
{
	@Id
    @Column(name = "seq")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;
	
	@ManyToOne
	@JoinColumn(name ="supply_seq")
	private SupplyEntity supply;
	
	@ManyToOne
	@JoinColumn(name = "book_seq")
	private BookEntity book;
}
