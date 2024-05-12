package bookstore.mapper;

import bookstore.config.MapperConfig;
import bookstore.dto.BookDto;
import bookstore.dto.BookRequestDto;
import bookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface BookMapper {
    BookDto toDto(Book book);

    Book toModel(BookRequestDto requestDto);
}
