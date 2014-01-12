package sayalija.UnixTools;

import java.util.Arrays;

public class Sort {

    public String getSorted(String text) {
        String[] data = text.split("\n");
        String result = "";
        Arrays.sort(data);
        for (String s : data) {
            result = result.concat(s).concat("\n");
        }
        return result;
    }
}
