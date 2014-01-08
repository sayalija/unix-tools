package sayalija.UnixTools;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by sayalija on 1/8/14.
 */
public class WcLibTest {
    @Test
    public void testCountChars() throws Exception {
        WcLib wc = new WcLib("Sayali \n Manali Pallavi");
        int actual = wc.countChars();
        int expected = 23;
        assertEquals(expected,actual);
    }

    @Test
    public void testCountWords() throws Exception {
    
    }

    @Test
    public void testCountLines() throws Exception {

    }
}
