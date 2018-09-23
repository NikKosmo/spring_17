package ru.otus.spring_17.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import ru.otus.spring_17.BookRepository;
import ru.otus.spring_17.damain.Book;

@RestController
@RequestMapping("books")
public class BookController {

    private BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    Flux<Book> getAll(){
        return Flux.fromIterable(repository.findAll());
    }

    @GetMapping("/{id}")
    Mono<Book> getById(@PathVariable("id") String id) {
        return Mono.just(repository.findById(id).orElseThrow(IllegalArgumentException::new));
    }
}
