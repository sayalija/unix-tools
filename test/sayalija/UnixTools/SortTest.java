package sayalija.UnixTools;

import junit.framework.Assert;
import org.junit.Test;

public class SortTest {
    @Test
    public void testGetSorted() throws Exception {
        Sort sort = new Sort();
        String expected = "aaa\nccc\nfff";
        String actual = sort.getSorted("aaa\nfff\nccc");
        Assert.assertEquals(expected, actual);
    }
}
