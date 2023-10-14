package com.sanvalero.libraryweb.service;

import com.sanvalero.libraryweb.domain.Book;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    Book[] arrayBooks = { 
        new Book(1L,"Libro de Ejemplo","Autor del libro de ejemplo","Categoría del libro de ejemplo",100,37.7749,-122.4194) ,
        new Book(2L,"Segundo Libro de Ejemplo","Autor del libro de ejemplo","Categoría del libro de ejemplo",100,37.7749,-122.4194) ,
    };
    

    @Override
    public Book findBook(long id) {

        //EL ERROR DETECTADO FUE QUE, NO EXISTEN ESOS ENDPOINTS PARA EL API QUE OBTIENE LOS LIBROS DE LA BASE DE DATOS, POR LOS QUE OMITÍ LA
        //PETICIÓN Y CREE UN PEQUEÑO DIRECTORIO DE LIBROS PARA QUE EL PROGRAMA FUNCIONE, AUNQUE IDENTIFIQUÉ OTRAS FORMAS DE ARREGLARLO.

        //RestTemplate restTemplate = new RestTemplate();
        //ResponseEntity<Book> response = restTemplate.getForEntity("http://localhost:5500/books/" + id, Book.class);

        for (Book book : arrayBooks) {
            if(book.getId() == id)
                return book;
        }
        
        return null;
    }

    @Override
    public List<Book> findAllBooks() {
        //RestTemplate restTemplate = new RestTemplate();
        //Book[] arrayBooks = restTemplate.getForObject("http://localhost:5500/books", Book[].class);
        
        //if (arrayBooks == null)
        //  return Collections.emptyList();

        List<Book> books = Arrays.asList(arrayBooks);
        return books;
    }

    @Override
    public List<Book> findAllBooks(String category) {
        return null;
    }
}
