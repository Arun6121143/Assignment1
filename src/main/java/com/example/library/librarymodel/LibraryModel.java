package com.example.library.librarymodel;

public class LibraryModel {
    
    private String Libname;
    private String Libaddres;
    public String getLibname() {
        return Libname;
    }
    public LibraryModel(String libname, String libaddres, int libnumber, Boolean libfacility) {
        Libname = libname;
        Libaddres = libaddres;
        Libnumber = libnumber;
        Libfacility = libfacility;
    }
    public void setLibname(String libname) {
        Libname = libname;
    }
    public String getLibaddres() {
        return Libaddres;
    }
    public void setLibaddres(String libaddres) {
        Libaddres = libaddres;
    }
    public int getLibnumber() {
        return Libnumber;
    }
    public void setLibnumber(int libnumber) {
        Libnumber = libnumber;
    }
   
   
    public Boolean getLibfacility() {
        return Libfacility;
    }
    public void setLibfacility(Boolean libfacility) {
        Libfacility = libfacility;
    }


    private int Libnumber;
    private Boolean Libfacility;
}
