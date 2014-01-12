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
        String header = "";
        int len = fileData.length;
        try {
            for (int i = len - lines; i < len; i++) {
                header = header.concat(fileData[i]).concat("\n");
            }
        } catch (Exception ex) {
            System.out.println("Exception");
        }
        return header;
    }
}
