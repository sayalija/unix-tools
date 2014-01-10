package sayalija.UnixTools.Head;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by sayalija on 1/9/14.
 */
public class HeadClient {
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
        String str = "";
        Head client1 = new Head(text);
        str = client1.getHeader();
        System.out.println("10 lines--->   \n"+str);
        Head client2 = new Head(text,3);
        str = client2.getHeader();
        System.out.println("3 lines--->   \n"+str);
    }
}