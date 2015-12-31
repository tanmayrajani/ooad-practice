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
public class FanTest {

    Switchable f;
    public FanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        f = new Fan();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testOn() {
        System.out.println("on");
        f.on();
        assertNotNull(f);
    }

    @Test
    public void testOff() {
        System.out.println("off");
        f.off();
        assertNotNull(f);
    }
    
}
