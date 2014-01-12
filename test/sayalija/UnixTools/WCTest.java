package sayalija.UnixTools;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WCTest {
    @Test
    public void testCountChars() throws Exception {
        WC wc = new WC("Sayali \n Manali Pallavi");
        int actual = wc.countChars();
        int expected = 23;
        assertEquals(expected, actual);
    }

    @Test
    public void testCountWords() throws Exception {
        WC wc = new WC("Sayali \n Manali Pallavi");
        int actual = wc.countLines();
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testCountLines() throws Exception {
        WC wc = new WC("Sayali \n Manali");
        int actual = wc.countWords();
        int expected = 2;
        assertEquals(expected, actual);
    }
}
