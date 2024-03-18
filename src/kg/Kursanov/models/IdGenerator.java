package kg.Kursanov.models;

public class IdGenerator {

    public static int idLibrary  = 0;

    public static int idGeneratorLibrary(){
        return ++idLibrary;
    }
    public static int idBook = 0;

    public static int idGeneratorBook(){
        return ++idBook;
    }
    public static int idReader = 0;

    public static int idGeneratorReader(){
        return ++idReader;
    }


}
