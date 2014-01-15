package sayalija.UnixTools.cli;

import sayalija.UnixTools.Cut;
import sayalija.fs.FileSystem;

public class CutClient {
    public static void main(String[] args) {
        try {
            String fileName = args[0];
            int fieldNumber = Integer.parseInt(args[1].substring(2, args[1].length()));
            String delimitor = " ";
            if(args.length == 3 && args[2].contains("-d"))
                delimitor = (args[2].substring(2, args[2].length()));
            FileSystem fs = new FileSystem();
            String text = fs.readFile(fileName);
            Cut c = new Cut(delimitor);
            System.out.println(c.cutLines(text,fieldNumber));
        } catch (Exception ex) {
            System.err.println("Exception  " + ex);
        }
    }
}
