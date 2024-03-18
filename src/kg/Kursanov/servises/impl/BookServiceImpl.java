package kg.Kursanov.servises.impl;

import kg.Kursanov.enums.Genre;
import kg.Kursanov.models.Book;
import kg.Kursanov.models.Database;
import kg.Kursanov.models.IdGenerator;
import kg.Kursanov.models.Library;
import kg.Kursanov.servises.BookService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {


    public Book saveBook(int libraryId, Book book) {

        book.setId(IdGenerator.idGeneratorBook());
        book.setLibraryId(libraryId);
        System.out.println("Write name book: ");
        book.setName(new Scanner(System.in).nextLine());
        System.out.println("Write name author: ");
        book.setAuthor(new Scanner(System.in).nextLine());
        book.setGenre(Genre.ODA);
        Database.books.add(book);
        System.out.println("Book saved successfully!");
        return book;
    }

    @Override
    public List<Book> getAllBooks(int libraryId) {
        List<Book> booksInLibrary = new ArrayList<>();
        for (Book book : Database.books) {
            if (book.getLibraryId() == libraryId) {
                booksInLibrary.add(book);
            }
        }
        System.out.println(booksInLibrary);
        return booksInLibrary;
    }

    @Override
    public Book getBookById(int libraryId, int bookId) {
            for (Book book : Database.books) {
                if (book.getLibraryId() == libraryId & book.getId() == bookId) {
                        System.out.println(book);
                }else System.out.println("Myndai Id jok!");
            }
        return null;
    }

    @Override
    public String deleteBook(int libraryId, int bookId) {
        Iterator<Book> iterator = Database.books.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getLibraryId() == libraryId && book.getId() == bookId) {
                iterator.remove();
                System.out.println("Success!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found!");
        }
        return null;
    }

    @Override
    public void clearBooksLibraryId(int libraryId) {
        List<Book> bookList = new ArrayList<>();

        for (Book book : Database.books) {
            if (book.getLibraryId() == libraryId){
                bookList.add(book);
            }
        }

        Database.books.clear();

        System.out.println(libraryId);


    }



}
