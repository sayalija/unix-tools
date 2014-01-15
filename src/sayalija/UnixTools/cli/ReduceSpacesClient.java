package sayalija.UnixTools.cli;

import sayalija.UnixTools.ReduceSpaces;
import sayalija.fs.FileSystem;

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
