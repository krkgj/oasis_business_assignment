package com.oasisbusiness.assignment.api.service;


import java.util.Optional;

import org.springframework.stereotype.Service;

import com.oasisbusiness.assignment.api.dto.BookDto;
import com.oasisbusiness.assignment.api.entity.BookEntity;
import com.oasisbusiness.assignment.api.repository.BookRepository;
import com.oasisbusiness.assignment.utils.Code;
import com.oasisbusiness.assignment.utils.ResultDto;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService 
{
	private final JPAQueryFactory query;
	private final BookRepository bookRepository;
	
	public ResultDto findBook(String author)
	{
		Optional<BookEntity> entity = bookRepository.findByAuthor(author);
		
		if(entity.isPresent())
			return new ResultDto(Code.RESULT_OK, "OK", BookDto.entity2DtoBuilder(entity.get()));
		
		return new ResultDto(Code.RESULT_EMPTY, "Fail");
	}
	
	public ResultDto registBook(BookDto book)
	{
		BookEntity result = bookRepository.save(BookEntity.dto2EntityBuilder(book));
		
		if(result == null)
			return new ResultDto(Code.RESULT_OK, "Fail");
		
		return new ResultDto(Code.RESULT_OK, "OK", BookDto.entity2DtoBuilder(result));
	}
	
}
