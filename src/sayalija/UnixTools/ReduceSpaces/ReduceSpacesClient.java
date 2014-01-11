package sayalija.UnixTools.ReduceSpaces;

import sayalija.UnixTools.FileSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sayalija on 1/11/14.
 */
public class ReduceSpacesClient {
    public static void main(String[] args) {
        String fileName;
            fileName = args[0];
        FileSystem fs = new FileSystem();
        String text = fs.readFile(fileName);
        ReduceSpaces r = new ReduceSpaces();
        text = r.reduceSpaces(text);
        System.out.println(text);

    }
}
