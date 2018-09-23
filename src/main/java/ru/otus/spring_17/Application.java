package ru.otus.spring_17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import ru.otus.spring_17.damain.Book;
import ru.otus.spring_17.damain.Genre;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        BookRepository bookRepository = context.getBean(BookRepository.class);
        Book book = new Book();
        book.setName("Catcher in the rye");
        Genre genre = new Genre();
        genre.setName("fiction");
        book.setGenre(genre);
        Book save = bookRepository.save(book);
        System.out.println(save);
    }

}
