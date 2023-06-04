package dju.bookTogether.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Book {

    @Id @GeneratedValue
    @Column(name="book_id")
    private Long id;

    private String name;
    private String author;
    private String isbn;
}
