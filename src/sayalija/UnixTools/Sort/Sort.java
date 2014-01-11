package sayalija.UnixTools.Sort;

import java.util.Arrays;

/**
 * Created by sayalija on 1/11/14.
 */
public class Sort {

    public String getSorted(String text){
        String[] data = text.split("\n");
        String result = "";
        Arrays.sort(data);
        for (String s : data) {
            result = result.concat(s).concat("\n");
        }
        return result;
    }
}
