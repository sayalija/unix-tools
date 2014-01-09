package sayalija.UnixTools;

/**
 * Created by sayalija on 1/8/14.
 */
public class WcLib {
    String text;

    public WcLib(String t) {
        text = t;
    }

    public int countChars() {
        return text.length();
    }

    public int countWords() {
        return text.split("\\S+").length - 1;
    }

    public int countLines() {
        return text.split("\n").length - 1;
    }

}