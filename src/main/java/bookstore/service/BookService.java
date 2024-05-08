package bookstore.service;

import bookstore.dto.BookDto;
import bookstore.dto.BookRequestDto;
import bookstore.model.Book;
import java.util.List;

public interface BookService {
    BookDto save(BookRequestDto bookDto);

    BookDto findById(Long id);

    List<Book> findAll();

    BookDto updateById(Long id, Book book);

    void deleteById(Long id);
}
