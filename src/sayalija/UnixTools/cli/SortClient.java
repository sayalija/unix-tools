package sayalija.UnixTools.cli;

import sayalija.fs.FileSystem;
import sayalija.UnixTools.Sort;

public class SortClient {
    public static void main(String[] args) {
        String fileName = args[0];
        FileSystem fs = new FileSystem();
        String text = fs.readFile(fileName);
        Sort s = new Sort();
        text = s.getSorted(text);
        System.out.println(text);

    }
}
