package com.oasisbusiness.assignment.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oasisbusiness.assignment.api.entity.BookEntity;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long>
{
	Optional<BookEntity> findByAuthor(String author);
}
