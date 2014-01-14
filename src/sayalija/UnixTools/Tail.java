package sayalija.UnixTools;

public class Tail {

    int lines;
    String text;

    public Tail(String data) {
        lines = 10;
        text = data;
    }

    public Tail(String data, int numberOfLines) {
        lines = numberOfLines;
        text = data;
    }

    public String getFooter() throws NullPointerException {
        String[] fileData = text.split("\n");
        String tailer = "";
        int len = fileData.length;
        try {
            for (int i = len - lines; i < len; i++) {
                tailer = tailer.concat(fileData[i]).concat("\n");
            }
        } catch (Exception ex) {
            System.out.println("Exception");
        }
        return tailer.substring(0, tailer.length() - 1);
    }
}
