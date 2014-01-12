package sayalija.UnixTools.cli;

import sayalija.fs.FileSystem;

public class CutClient {
    public static void main(String[] args) {
        String fileName = args[0];
        FileSystem fs = new FileSystem();
        String text = fs.readFile(fileName);
    }
}
