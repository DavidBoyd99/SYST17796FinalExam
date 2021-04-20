
package systfinalexam;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class SYSTFinalExamIT {
    
    public SYSTFinalExamIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of calculateAverage method, of class SYSTFinalExam.
     */
    @Test
    public void testCalculateAverage() {
        System.out.println("calculateAverage");
        int num1 = 4;
        int num2 = 5;
        int num3 = 6;
        SYSTFinalExam instance = new SYSTFinalExam();
        double expResult = 5.0;
        double result = instance.calculateAverage(num1, num2, num3);
        assertEquals(expResult, result, 0.0);
    }
    
}
