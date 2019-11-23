package com.kodilla.exception.main;

import com.kodilla.exception.io.FileREaderWithoutHandling;
import com.kodilla.exception.io.FileReaderException;

public class ExceptionModuleRunner {
    public static void main(String[] args) {
        FileREaderWithoutHandling fileREaderWithoutHandling = new FileREaderWithoutHandling();
        try {
            fileREaderWithoutHandling.readFile();
        } catch (FileReaderException e) {
            System.out.println("Problem while reading a file!");
        }
    }
}
