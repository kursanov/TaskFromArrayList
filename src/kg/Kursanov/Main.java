package kg.Kursanov;


import kg.Kursanov.enums.Gender;
import kg.Kursanov.enums.Genre;
import kg.Kursanov.models.*;
import kg.Kursanov.servises.LibraryService;
import kg.Kursanov.servises.ReaderService;
import kg.Kursanov.servises.impl.BookServiceImpl;
import kg.Kursanov.servises.impl.LibraryServiceImpl;
import kg.Kursanov.servises.impl.ReaderServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        BookServiceImpl bookService = new BookServiceImpl();
        LibraryService libraryService = new LibraryServiceImpl();
        ReaderService readerService = new ReaderServiceImpl();





        while (true) {
            System.out.println("""
                    1.Save Library
                    2.Get all books
                    3.Get Book id
                    4.Delete book by id
                    5.Clear books by library id
                    
                    6.Save reader
                    7.Get all readers
                    8.Get reader by id
                    9.Update reader
                    10.Assign reader to library
                    
                    11.Save book
                    12.Get all library
                    13.Get library by id
                    14.Update library
                    15.Delete library
                    
                   
                                 
                    """);


            switch (new Scanner(System.in).nextInt()) {
                case 1: {
                    libraryService.saveLibrary(Database.libraries);break;
                }
                case 2:{
                    bookService.getAllBooks(1);break;
                }
                case 3:{
                    bookService.getBookById(1,1);break;
                }
                case 4:{
                    bookService.deleteBook(1,1);break;
                }
                case 5:{
                    bookService.clearBooksLibraryId(1);break;
                }

                case 6:{

                    Reader reader = new Reader();
                    reader.setId(IdGenerator.idGeneratorReader());
                    System.out.println("Full Name: ");
                    reader.setFullName(new Scanner(System.in).nextLine());
                    System.out.println("Email: ");
                    reader.setEmail(new Scanner(System.in).nextLine());
                    System.out.println("Phone number: ");
                    reader.setPhoneNumber(new Scanner(System.in).nextLine());
                    reader.setGender(Gender.MALE);
                    readerService.saveReader(reader);
                    break;
                }
                case 7:{
                    readerService.getAllReaders();break;
                }
                case 8:{
                    readerService.getReaderById(2);
                }
                case 9:{
                    readerService.updateReader(1,new Reader());break;
                }
                case 10:{

//                    readerService.assignReaderToLibrary();
                }
                case 11:{
                    bookService.saveBook(1, new Book());break;
                }
                case 12:{
                    libraryService.getAllLibraries();
                }
                case 13:{
                    libraryService.getLibraryById(1);
                }
                case 14:{
                    libraryService.updateLibrary(1,new Library());
                }
                case 15:{
                    libraryService.deletedLibrary(2);
                }
            }



        }







    }
}