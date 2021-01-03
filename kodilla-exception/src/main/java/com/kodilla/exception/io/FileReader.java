package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {

    public void readFile() throws FileReaderException{
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
        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {
            fileLines.forEach(System.out::println);
        } catch (IOException e) {
            throw new FileReaderException();
        } finally {
                System.out.println("I am gonna be here... always!");
            }

        System.out.println(file.getPath());
    }
    public void readFile(final String fileName) throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();

        try (Stream<String> fileLines = Files.lines(Path.of(classLoader.getResource(fileName).toURI()))) {
            fileLines.forEach(System.out::println);
        } catch (Exception e) {
            throw new FileReaderException();
        } finally {
            System.out.println("I am gonna be here... always!");
        }
    }
}