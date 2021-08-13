package JavaCollections.OptionalTask;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class AddFile {

    public static void main(String [] args) throws IOException {
        ArrayList<String> step ;
        step = (ArrayList<String>) Files.readAllLines(Paths.get("src\\main\\java\\JavaCollections\\Step.txt"));
      System.out.println(step);
        Collections.reverse(step);
        System.out.println(step);
        Path file = Paths.get("src\\main\\java\\JavaCollections\\Step2.txt");
        Path write = Files.write(file, step, StandardCharsets.UTF_8);
    }
}


