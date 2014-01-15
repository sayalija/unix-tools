package sayalija.UnixTools;


public class Head {
    int lines;
    String text;

    public Head(String data) {
        this.lines = 10;
        this.text = data;
    }

    public Head(String data, int numberOfLines) {
        this.lines = numberOfLines;
        this.text = data;
    }

    public String getHeader() {
        String[] fileData = text.split("\n");
        StringBuilder header = new StringBuilder();
        try {
            for (int i = 0; i < lines; i++) {
                header.append(fileData[i]).append("\n");
            }
        } catch (Exception ex) {
            System.out.println("Exception");
        }
        return header.toString().substring(0,header.length()-1);
    }

}
