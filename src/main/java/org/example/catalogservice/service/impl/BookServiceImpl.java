package org.example.catalogservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.catalogservice.repository.BookRepository;
import org.example.catalogservice.service.BookService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

}


