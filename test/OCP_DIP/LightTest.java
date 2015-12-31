package OCP_DIP;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tanmay.rajani
 */
public class LightTest {
    
    Switchable l;
    public LightTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        l = new Light();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testOn() {
        System.out.println("on");
        l.on();
        assertNotNull(l);
    }

    @Test
    public void testOff() {
        System.out.println("off");
        l.off();
        assertNotNull(l);
    }
    
}
