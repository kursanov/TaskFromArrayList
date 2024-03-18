package kg.Kursanov.servises.impl;

import kg.Kursanov.enums.Gender;
import kg.Kursanov.models.Database;
import kg.Kursanov.models.IdGenerator;
import kg.Kursanov.models.Library;
import kg.Kursanov.models.Reader;
import kg.Kursanov.servises.ReaderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderServiceImpl implements ReaderService {

    @Override
    public void saveReader(Reader reader) {
        Database.readers.add(reader);

    }

    @Override
    public List<Reader> getAllReaders() {
        List<Reader> readers = new ArrayList<>();
        for (Reader reader : Database.readers) {
            readers.add(reader);
        }
        System.out.println(readers);
        return readers;
    }

    @Override
    public Reader getReaderById(int id) {
        boolean found = false;
        for (Reader reader : Database.readers) {
            if(reader.getId() == id){
                System.out.println(reader);
                found = true;
            }

        }

        if (!found){
            System.out.println("Not found!");
        }
        return null;
    }

    @Override
    public Reader updateReader(int id, Reader reader) {
        for (Reader reader1 : Database.readers) {
            if (reader1.getId() == id){
                reader1.setFullName("Zaripbek Kursanov");
                reader1.setEmail("Z@gmail.com");
                reader1.setPhoneNumber("+9965004200291");
                reader1.setGender(Gender.MALE);
                System.out.println("Success");
                return reader1;

            }

        }
        return null;
    }

    @Override
    public void assignReaderToLibrary(int readerId, int libraryId) {









    }
}
