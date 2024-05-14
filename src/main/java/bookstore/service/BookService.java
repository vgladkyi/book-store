package bookstore.service;

import bookstore.dto.BookSearchParametersDto;
import bookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    Book findById(Long id);

    List<Book> findAll();

    Book updateById(Long id, Book book);

    void deleteById(Long id);

    List<Book> search(BookSearchParametersDto params);
}
