package sayalija.UnixTools;

import org.junit.Assert;
import org.junit.Test;

public class UniqTest {
    @Test
    public void testGetUniqueLinesForDublicatesInBetween() throws Exception {
        Uniq uniq = new Uniq("1\n2\n3\n3\n4");
        String expected = "1\n2\n3\n4";
        Assert.assertEquals(expected, uniq.getUniqLines());
    }

    @Test
    public void testGetUniqueLinesForDublicatesAtLast() throws Exception {
        Uniq uniq = new Uniq("1\n2\n3\n3\n4\n4");
        String expected = "1\n2\n3\n4";
        Assert.assertEquals(expected, uniq.getUniqLines());
    }
}
