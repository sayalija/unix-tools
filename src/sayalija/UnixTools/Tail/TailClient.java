package sayalija.UnixTools.Tail;

import sayalija.UnixTools.FileSystem;


/**
 * Created by sayalija on 1/10/14.
 */
public class TailClient {
    public static void main(String[] args) {
        int lines = Integer.parseInt(args[0])*-1;
        String fileName = args[1];
        FileSystem fs = new FileSystem();
        String text = fs.readFile(fileName);
        String str = "";
        Tail client1 = new Tail(text);
        str = client1.getFooter();
        System.out.println("10 lines--->   \n"+str);
        Tail client2 = new Tail(text,lines);
        str = client2.getFooter();
        System.out.println("3 lines--->   \n"+str);
    }
}
