package bookstore.service;

import bookstore.dto.BookDto;
import bookstore.dto.BookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(BookRequestDto bookDto);

    BookDto findById(Long id);

    List<BookDto> findAll();

    BookDto updateById(Long id, BookRequestDto requestDto);

    void deleteById(Long id);
}
