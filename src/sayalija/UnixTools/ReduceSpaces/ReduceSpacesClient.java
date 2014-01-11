package sayalija.UnixTools.ReduceSpaces;

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
        BufferedReader br = null;
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
        ReduceSpaces r = new ReduceSpaces();
        text = r.reduceSpaces(text);
        System.out.println(text);

    }
}
