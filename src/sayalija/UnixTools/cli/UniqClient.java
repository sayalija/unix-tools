package sayalija.UnixTools.cli;

import sayalija.UnixTools.Uniq;
import sayalija.fs.FileSystem;

public class UniqClient {
    public static void main(String[] args) {
        String fileName = args[0];
        FileSystem fs = new FileSystem();
        String text = fs.readFile(fileName);
        Uniq uniq = new Uniq(text);
        System.out.println(uniq.getUniqLines());
    }
}
