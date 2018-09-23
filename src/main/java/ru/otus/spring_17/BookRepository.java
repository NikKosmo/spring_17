package ru.otus.spring_17;


import org.springframework.data.repository.CrudRepository;
import ru.otus.spring_17.damain.Book;

public interface BookRepository extends CrudRepository<Book, String> {
}
