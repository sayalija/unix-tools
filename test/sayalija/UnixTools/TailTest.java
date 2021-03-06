package sayalija.UnixTools;

import junit.framework.Assert;
import org.junit.Test;

public class TailTest {
    @Test
    public void testGetFooterForDefault10Lines() throws Exception {
        Tail tail = new Tail("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12");
        String expected = "3\n4\n5\n6\n7\n8\n9\n10\n11\n12";

        String actual = tail.getFooter();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFooterForLimitedLinesAs3() throws Exception {
        Tail tail = new Tail("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12", 3);
        String expected = "10\n11\n12";

        String actual = tail.getFooter();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFooterFromEmptyString() throws Exception {
        Tail tail = new Tail("",3);
        String expected = "";

        String actual = tail.getFooter();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetFooterFor20LinesWhereAvailableStringHas12Lines() throws Exception {
        Tail tail = new Tail("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12",20);
        String expected = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12";

        String actual = tail.getFooter();
        Assert.assertEquals(actual,expected);
    }
}
