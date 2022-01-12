package com.oasisbusiness.assignment.api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.oasisbusiness.assignment.api.dto.BookDto;
import com.oasisbusiness.assignment.api.service.BookService;
import com.oasisbusiness.assignment.utils.ResultDto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BookController 
{
	private final BookService bookService;
	
	@GetMapping("/books")
	@ApiOperation(value = "도서 조회", notes = "성공 시 ResultDto에 200과 조회된 BookDto를 리턴합니다.")
	public ResultDto findBook(@RequestParam(value = "author") String author)
	{
		return bookService.findBook(author);
	}
	
	@PostMapping("/books")
	@ApiOperation(value = "도서 등록", notes = "성공 시 ResultDto에 200과 등록된 BookDto를 리턴합니다.")
	public ResultDto registBooks(@RequestBody BookDto book)
	{
		return bookService.registBook(book);
	}
	
	@PatchMapping("/books")
	public void updateBooks()
	{
		
	}
	
	@DeleteMapping("/books")
	public void deleteBooks()
	{
		
	}

}
