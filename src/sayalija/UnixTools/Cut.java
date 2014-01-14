package sayalija.UnixTools;

import com.sun.org.apache.regexp.internal.recompile;

public class Cut {
    String delimiter ;
    public Cut(){
        delimiter = " ";
    }
    public Cut(String d){
        delimiter = d;
    }
    StringBuilder result = new StringBuilder("");

    public String cutLines(String text, int fieldNumber) {
        String[] lines;
        lines = text.split("\n");
        fieldNumber = fieldNumber - 1;
        String res = "";
        if (!text.contains(delimiter))
            return text;
        for (String line : lines) {
            String[] fields = line.split(delimiter);
            if (fieldNumber < fields.length)
                result.append(fields[fieldNumber]).append("\n");
            else result.append("").append("\n");
        }
        res = result.toString();
        return res.substring(0,res.length()-1);
    }

}