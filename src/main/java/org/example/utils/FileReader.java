package org.example.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {

    public String readFile(String file) throws IOException {
        return Files.readString(Paths.get(file));
    }
}
