package sayalija.UnixTools.cli;

import sayalija.UnixTools.Tail;
import sayalija.fs.FileSystem;

public class TailClient {
    public static void main(String[] args) {
        int lines = 0;
        String fileName = "";
        if (args[0].contains("-")) {
            lines = Integer.parseInt(args[0]) * -1;
            fileName = args[1];
        } else {
            fileName = args[0];
            lines = 10;
        }
        FileSystem fs = new FileSystem();
        String text = fs.readFile(fileName);
        String str = "";
        Tail client = new Tail(text, lines);
        str = client.getFooter();
        System.out.println(str);
    }
}
