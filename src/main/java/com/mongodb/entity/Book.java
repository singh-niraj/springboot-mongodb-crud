package com.mongodb.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "book")
public class Book {

	@Id
	private int bookId;
	private String bookName;
	private String authorName;

}
