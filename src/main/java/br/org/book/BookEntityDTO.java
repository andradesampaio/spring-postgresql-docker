package br.org.book;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
//Cria um construtor privado com todos os atributos.
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class BookEntityDTO {

        private String title;
        private String author;
        private int amount;
        private BigDecimal price;

    public static BookEntityDTO convertToDTO(BookEntity bookEntity) {
        return new BookEntityDTO(bookEntity.getTitle(), bookEntity.getAuthor(), bookEntity.getAmount(), bookEntity.getPrice());
    }
}
