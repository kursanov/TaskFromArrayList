package kg.Kursanov.servises;

import kg.Kursanov.models.Library;

import java.util.List;

public interface LibraryService {

    List<Library> saveLibrary(List<Library> libraries);

    List<Library> getAllLibraries();

    Library getLibraryById(int id);

    Library updateLibrary(int id,Library library);

    String deletedLibrary(int id);



}
