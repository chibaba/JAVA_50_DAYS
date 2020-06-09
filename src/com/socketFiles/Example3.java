package com.socketFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) throws IOException{
        String pathString = System.getProperty("java.io.tmpdir");
        Path path = Paths.get(pathString);
        Stream<Path> fileNames = Files.list(path);
        fileNames.limit(5).forEach(System.out::println);
    }
}
