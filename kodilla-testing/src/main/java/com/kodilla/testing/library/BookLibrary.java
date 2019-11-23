package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public HashMap<LibraryUser, ArrayList<Book>> listBooksInHandsOf(LibraryUser libraryUser) {
        HashMap<LibraryUser, ArrayList<Book>> mapOfRentedBooks= new HashMap<>();
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("|sada","dasdsa",1957));
        bookList.add(new Book("|sada","dasdsa",1957));
        bookList.add(new Book("|sada","dasdsa",1957));

        ArrayList<Book> bookList2 = new ArrayList<>();
        bookList.add(new Book("|sada","dasdsa",1957));
        bookList.add(new Book("|sada","dasdsa",1957));
        bookList.add(new Book("|sada","dasdsa",1957));

        mapOfRentedBooks.put(libraryUser, bookList);
        mapOfRentedBooks.put(libraryUser, bookList2);

        return mapOfRentedBooks;
    }
}