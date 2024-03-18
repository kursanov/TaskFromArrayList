package kg.Kursanov.servises.impl;

import kg.Kursanov.models.Book;
import kg.Kursanov.models.Database;
import kg.Kursanov.models.IdGenerator;
import kg.Kursanov.models.Library;
import kg.Kursanov.servises.LibraryService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService {

    public static List<Library> libraries = new ArrayList<>();




    @Override
    public List<Library> saveLibrary(List<Library> libraries) {
        Library library = new Library();
            library.setId(IdGenerator.idGeneratorLibrary());
            System.out.println("Name library: ");
            library.setName(new Scanner(System.in).nextLine());

            System.out.println("Address : ");
            library.setAddress(new Scanner(System.in).nextLine());

            library.setBooks(Database.books);

            Database.libraries.add(library);

            System.out.println("Library added: " + library.getName());

        return libraries;

    }

    @Override
    public List<Library> getAllLibraries() {
        System.out.println(Database.libraries);
        return Database.libraries;
    }

    @Override
    public Library getLibraryById(int id) {
        for (Library library : Database.libraries) {
            if (library.getId() == id){
                System.out.println(library);break;
            }else System.out.println("This is library id not! " + id);break;

        }
        return null;
    }

    @Override
    public Library updateLibrary(int id, Library library) {
        for (Library library1 : Database.libraries) {
            if (library1.getId() == id){
                library1.setId(IdGenerator.idGeneratorLibrary());
                library1.setName("Kitepkana");
                library1.setAddress("Bishkek");
                library1.setBooks(Database.books);
                System.out.println("Success!");
                return library1;
            }else System.out.println("This is library id not! " + id);break;

        }
        return null;
    }

    @Override
    public String deletedLibrary(int id) {

        for (Library library : Database.libraries) {
            if (library.getId() == id) {
                Database.libraries.remove(library);
                System.out.println("Success");
                break;
            }else System.out.println("This is library id not! " + id);break;
        }
        return null;


    }





}
