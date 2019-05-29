package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;


public class IOTesting {

    public static void main(String[] args) {

        String directory = "data";

        Path folder = Paths.get(directory);
        Path file = Paths.get(directory, "info.txt");

        if (Files.notExists(folder)) {
            try {
                Files.createDirectories(folder);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (!Files.exists(file)) {
            try {
                Files.createFile(file);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        List<String> names = Arrays.asList("Carson", "Larson", "Jarson", "Marson");
        try {
            Files.write(file, names);
        }catch (IOException e){
            e.printStackTrace();
        }

//        new file within the data directory
        Path file2 = Paths.get(directory, "names.txt");
        if (Files.notExists(file2)){
            try{
                Files.createFile(file2);
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        List<String> colors =  Arrays.asList("Blue", "Green", "Yellow", "Red");
        try {
            Files.write(file2, colors);
        }catch (IOException e){
            e.printStackTrace();
        }
        
        try {
            List<String> colorsFromFile = Files.readAllLines(file2);
            for (String line: colorsFromFile) {
                System.out.println(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
