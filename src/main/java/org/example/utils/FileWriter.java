package org.example.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {

    public void writeToFile(String file, String content) throws IOException {
        Files.writeString(Paths.get(file), content);
        System.out.printf("file %s has been created", file);
    }
}
