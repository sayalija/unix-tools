package sayalija.UnixTools.Sort;

/**
 * Created by sayalija on 1/11/14.
 */
public class SortClient {
    public static void main(String[] args) {
        String str = "sss\nfff\nwww\nbbb";
        Sort s = new Sort();
        str = s.getSorted(str);
        System.out.println(str);

    }
}
