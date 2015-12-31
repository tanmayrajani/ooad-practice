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
public class LightControllerTest {
    
    LightController l1;
    public LightControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        l1 = new LightController();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testControl() {
        System.out.println("control");
        l1.control();
        assertNotNull(l1);
    }
    
}
