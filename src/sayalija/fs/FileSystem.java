package sayalija.fs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSystem {
    public String readFile(String fileName) {
        BufferedReader br;
        String text = "";
        try {
            String sCurrentLine;

            br = new BufferedReader(new FileReader(fileName));

            while ((sCurrentLine = br.readLine()) != null) {
                text += "\n" + sCurrentLine;
            }

        } catch (IOException e) {
            System.out.println("File not exist");
        }

        return text;
    }
}
