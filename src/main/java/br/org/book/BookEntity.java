package br.org.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookEntity {

    @Id
    private Long id;

    private String title;
    private String author;
}
