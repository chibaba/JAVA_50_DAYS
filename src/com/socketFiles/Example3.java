package com.socketFiles;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Collections;
import java.util.stream.Stream;

public class Example3 {
    public static void main(String[] args) throws IOException{
        String pathString = System.getProperty("user.home");
        Path path = Paths.get(System.getProperty("user.home"));
        Files.walkFileTree(path, Collections.emptySet(), 2, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                System.out.println(dir.toString());
                return FileVisitResult.CONTINUE;
            }
        });

        // the program will run until a permission related exception arrives

//        Path path = Paths.get(pathString);
//        Stream<Path> fileNames = Files.list(path).filter(Files::isDirectory);
//        fileNames.limit(5).forEach( (item) -> {
//            System.out.println(item.toString());
//            try {
//                Stream<Path> fileNames2 = Files.list(item).filter(Files::isDirectory);
//                fileNames2.forEach(System.out::println);
//            } catch (IOException ioe) {}
//        });
    }
}
