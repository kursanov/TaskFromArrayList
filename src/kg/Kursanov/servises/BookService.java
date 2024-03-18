package kg.Kursanov.servises;

import kg.Kursanov.models.Book;

import java.util.List;

public interface BookService {

    Book saveBook(int libraryId, Book book);

    List<Book> getAllBooks(int libraryId);

    Book getBookById(int libraryId, int bookId );

    String deleteBook(int libraryId, int bookId);

    void clearBooksLibraryId(int libraryId);

}
