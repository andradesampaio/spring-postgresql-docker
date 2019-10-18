package br.org.book;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;

import java.util.UUID;

public interface BookRepository  extends JpaRepository<BookEntity,String> {

    @Nullable
    BookEntity findById(@Nullable Long id);

}
