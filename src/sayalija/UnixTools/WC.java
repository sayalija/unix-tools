package sayalija.UnixTools;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WC {

    public static void main(String[] args) {
        String fileName = args[0];
        BufferedReader br = null;
        String text = null;
        try {

            String sCurrentLine;

            br = new BufferedReader(new FileReader(fileName));

            while ((sCurrentLine = br.readLine()) != null) {
                text += "\n" + sCurrentLine;
            }

        } catch (IOException e) {
            System.out.println("File not exist");
        }
        WcLib wc = new WcLib(text);
        System.out.println(wc.countLines() + "\t" + wc.countWords() + "\t" + wc.countChars() + "\t" + fileName);
    }
}