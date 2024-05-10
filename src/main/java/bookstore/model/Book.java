package bookstore.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

@Getter
@Setter
@Entity
@SQLDelete(sql = "UPDATE books SET is_deleted = true WHERE id=?")
@SQLRestriction("is_deleted=false")
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "title")
    private String title;

    @Column(nullable = false, name = "author")
    private String author;

    @Column(nullable = false, name = "isbn", unique = true)
    private String isbn;

    @Column(nullable = false, name = "price")
    private BigDecimal price;

    @Column(nullable = false, name = "description")
    private String description;

    @Column(nullable = false, name = "cover_image")
    private String coverImage;

    @Column(nullable = false, name = "is_deleted")
    private boolean isDeleted = false;

}
