package sayalija.UnixTools;

import junit.framework.Assert;
import org.junit.Test;

public class HeadTest {
    @Test
    public void testGetHeaderForDefault10Lines() throws Exception {
        Head head = new Head("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12");
        String expected = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10";
        String actual = head.getHeader();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetHeaderForLimitedLinesAs3() throws Exception {
        Head head = new Head("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12",3);
        String expected = "1\n2\n3";
        String actual = head.getHeader();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testGetHeaderFromEmptyString() throws Exception {
        Head head = new Head("",3);
        String expected = "";
        String actual = head.getHeader();
        Assert.assertEquals(actual,expected);
    }
    
}
