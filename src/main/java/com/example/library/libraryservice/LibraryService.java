package com.example.library.libraryservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.library.librarymodel.LibraryModel;

@Service
public class LibraryService {
    static List<LibraryModel> libraries = new ArrayList<>();
    static {
            libraries.add(new LibraryModel("BharatLibrary","Gandhinagar",7,true));
            libraries.add(new LibraryModel("schoolLibrary","Ganganagar",10,false));
           
        
    }
    public LibraryModel getLibname(String name) {
        return libraries.stream().filter(t -> t.getLibname().equals(name)).findFirst().get();
    }

    public void addLib(LibraryModel lib){
        libraries.add(lib);
    }

    public List<LibraryModel> getAll(){
        return libraries;

    }
}
