package sayalija.UnixTools;

public class Uniq {

    String text = "";

    public Uniq(String text) {
        this.text = text;
    }

    public String getUniqLines() {
        String records[];
        StringBuilder sb = new StringBuilder();
        records = text.split("\n");
        for (int i = 0; i < records.length - 1; i++) {
            if (!records[i].equalsIgnoreCase(records[i + 1])) {
                sb.append(records[i]).append("\n");
            }
        }
        sb.append(records[records.length-1]);
        return sb.toString();
    }
}
