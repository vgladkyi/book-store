package bookstore.service.impl;

import bookstore.exception.EntityNotFoundException;
import bookstore.model.Book;
import bookstore.repository.BookRepository;
import bookstore.service.BookService;
import jakarta.transaction.Transactional;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Can't find book by id" + id));
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Transactional
    @Override
    public Book updateById(Long id, @RequestBody Book book) {
        bookRepository.findById(id).orElseThrow(
                () -> new EntityNotFoundException("Book not found by id " + id));
        book.setId(id);
        return bookRepository.save(book);
    }

    @Override
    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }
}
