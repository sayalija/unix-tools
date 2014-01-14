package sayalija.UnixTools;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by sayalija on 1/14/14.
 */
public class CutTest {
    @Test
    public void testCutLinesWithDefaultDelimitor() throws Exception {
        Cut cut = new Cut();
        String expected = "d\ne\nm";
        String actual = cut.cutLines("s d f\nh e v\nq m r",2);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testCutLinesCommaAsDelimitor() throws Exception {
        Cut cut = new Cut(",");
        String expected = "s\nh\nq";
        String actual = cut.cutLines("s,d,f\nh,e,v\nq,m,r",1);
        Assert.assertEquals(actual,expected);
    }
}
