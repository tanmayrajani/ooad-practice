package OCP_DIP;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchTest {
    
    Switch instance;
    public SwitchTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Switch(new Light());
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testTurnOn() {
        System.out.println("turnOn");
        instance.turnOn();
        assertNotNull(instance);
    }

    @Test
    public void testTurnOff() {
        System.out.println("turnOff");
        instance.turnOff();
        assertNotNull(instance);
    }
    
}
