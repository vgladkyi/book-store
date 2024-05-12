package bookstore.service;

import bookstore.model.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);

    Book findById(Long id);

    List<Book> findAll();

    Book updateById(Long id, Book book);

    void deleteById(Long id);
}
