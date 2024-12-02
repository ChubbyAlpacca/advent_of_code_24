package org.aoc.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public String readFile(String path) {
        try {
            // Read all bytes from the file and convert them to a string
            return new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            // Handle exceptions by printing the stack trace and returning null or a meaningful message
            System.out.println(e.getMessage());
            return null;
        }
    }

}
