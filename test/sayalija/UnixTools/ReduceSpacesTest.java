package sayalija.UnixTools;

import junit.framework.Assert;
import org.junit.Test;

public class ReduceSpacesTest {
    @Test
    public void testReduceSpacesForSimpleString() throws Exception {
        ReduceSpaces rs = new ReduceSpaces();
        String expected = "abc de f\n gh";
        String actual = rs.reduceSpaces("abc    de f\n gh");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testReduceSpacesForSpacesAtEnding() throws Exception {
        ReduceSpaces rs = new ReduceSpaces();
        String expected = "abc de f\n gh";
        String actual = rs.reduceSpaces("abc    de f\n gh     ");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testReduceSpacesForSpacesAtStarting() throws Exception {
        ReduceSpaces rs = new ReduceSpaces();
        String expected = "abc de f\n gh";
        String actual = rs.reduceSpaces("    abc    de f\n gh     ");
        Assert.assertEquals(expected,actual);
    }
}