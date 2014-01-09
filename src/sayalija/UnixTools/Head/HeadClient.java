package sayalija.UnixTools.Head;

/**
 * Created by sayalija on 1/9/14.
 */
public class HeadClient {
    public static void main(String[] args) {
        String str = null;
        Head client = new Head("s \n a \n y \n a \n l \n i \n  \n j \n a \n g \n t \n a \n p",3);
        client.getHeader();
        System.out.println(str);
    }
}
