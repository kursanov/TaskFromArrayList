package kg.Kursanov.servises;

import kg.Kursanov.models.Reader;

import java.util.List;

public interface ReaderService {

    void saveReader(Reader reader);

    List<Reader> getAllReaders();

    Reader getReaderById(int id);

    Reader updateReader(int id,Reader reader);

    void assignReaderToLibrary(int readerId,int libraryId);
}
