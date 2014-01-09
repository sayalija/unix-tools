package sayalija.UnixTools.Head;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;

/**
 * Created by sayalija on 1/9/14.
 */
public class Head {
    int lines;
    String text;

    public Head(String data) {
        lines = 10;
        text = data;
    }

    public Head(String data, int numberOfLines) {
        lines = numberOfLines;
        text = data;
    }

    public String getHeader() throws NullPointerException {
        String[] fileData = text.split("\n");
        String header = "";
        try {
            for (int i = 0; i < lines; i++) {
                header = header.concat(fileData[i]).concat("\n");
            }
        } catch (Exception ex) {
            System.out.println("NULL");
        }
        return header;
    }

}
