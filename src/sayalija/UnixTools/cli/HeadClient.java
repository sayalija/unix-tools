package sayalija.UnixTools.cli;


import sayalija.UnixTools.Head;
import sayalija.fs.FileSystem;

public class HeadClient {
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
        StringBuilder str = new StringBuilder();

        Head client = new Head(text, lines);
        str.append(client.getHeader());
        System.out.println(str.toString());
    }
}