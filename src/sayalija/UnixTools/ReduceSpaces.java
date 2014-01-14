package sayalija.UnixTools;

public class ReduceSpaces {
    public String reduceSpaces(String text) {
        String result = text.replaceAll("[ ]+", " ");
        if (" ".compareTo(result.substring(result.length() - 1, result.length())) == 0)
            result = result.substring(0, result.length() - 1);
        if (" ".compareTo(result.substring(0, 1)) == 0)
            result = result.substring(1, result.length());
        return result;
    }
}
