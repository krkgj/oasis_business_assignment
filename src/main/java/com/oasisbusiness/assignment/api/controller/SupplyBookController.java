package com.oasisbusiness.assignment.api.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oasisbusiness.assignment.api.service.SupplyBookService;
import com.oasisbusiness.assignment.utils.ResultDto;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class SupplyBookController 
{
	private final SupplyBookService supplyBookService;
	
	@GetMapping("/supply-books")
	@ApiOperation(value = "공급도서 상세조회", notes = "성공 시 ResultDto에 200과 조회된 공급도서들의 상세를 조회합니다.")
	public ResultDto findSupplyBook()
	{
		return supplyBookService.findSupplyBook(BigDecimal.ZERO);
	}
	
	@GetMapping("/supply-books/discount")
	@ApiOperation(value = "공급도서 할인율 적용 상세조회", 
		notes = "성공 시 rate 이상의 할인율이 적용된 공급도서가 조회됩니다.")
	public ResultDto findSupplyBookDiscountRate(@RequestParam(value = "rate") BigDecimal discountRate)
	{
		return supplyBookService.findSupplyBook(discountRate);
	}
	
	@PostMapping
	
	
	@PatchMapping("/supply-books")
	public void updateSupplyBook()
	{
		
	}
	
	@DeleteMapping("/supply-books")
	public void deleteSupplyBook()
	{
		
	}
}
