package sayalija.UnixTools;

public class WC {
    String text;

    public WC(String t) {
        text = t;
    }

    public int countChars() {
        return text.length();
    }

    public int countWords() {
        return text.split("\\S+").length;
    }

    public int countLines() {
        return text.split("\n").length - 1;
    }

}
