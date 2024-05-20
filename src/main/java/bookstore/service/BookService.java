package bookstore.service;

import bookstore.dto.BookSearchParametersDto;
import bookstore.model.Book;
import java.util.List;
import org.springframework.data.domain.Pageable;

public interface BookService {
    Book save(Book book);

    Book findById(Long id);

    List<Book> findAll(Pageable pageable);

    Book updateById(Long id, Book book);

    void deleteById(Long id);

    List<Book> search(BookSearchParametersDto params, Pageable pageable);
}
