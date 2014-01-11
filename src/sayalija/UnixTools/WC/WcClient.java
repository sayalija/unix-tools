package sayalija.UnixTools.WC;

import sayalija.UnixTools.FileSystem;

public class WcClient {

    public static void main(String[] args) {
        String fileName = args[0];
        FileSystem fs = new FileSystem();
        String text = fs.readFile(fileName);
        WC wc = new WC(text);
        System.out.println(wc.countLines() + "\t" + wc.countWords() + "\t" + wc.countChars() + "\t" + fileName);
    }
}