package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public void readFile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();
        File file1 = new File(classLoader.getResource("names.txt").getFile());
        File file = null;
        try {
            String decodedPath = URLDecoder.decode(file1.getPath().replace('/', File.separatorChar).replace('|', ':'), "UTF-8");
            file = new File(decodedPath);
        } catch (IOException e) {
            System.out.println("Błąd przeksztalcenia");
        }



        //Path path = Paths.get(file.getPath());
        //Path path = Paths.get("tego-pliku-nie-ma.txt");
       Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));
            fileLines.forEach(System.out::println);


        System.out.println(file.getPath());
    }
}
