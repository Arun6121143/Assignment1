package com.example.library.librarycontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.librarymodel.LibraryModel;
import com.example.library.libraryservice.LibraryService;

@RestController
@RequestMapping("/api/library")
public class Librarycontroller {
    @Autowired

    private LibraryService service;

    @GetMapping("/lib/Libname/{name}")
    public LibraryModel getLibname(@PathVariable String name){
       return service.getLibname(name);
    }
   
    @GetMapping("/findall")
    public List<LibraryModel> getAll(){
       return service.getAll();
    }
    @PostMapping("/addlibrary")
    public void addLib(@RequestBody LibraryModel lib){
       service.addLib(lib);

    }

}
