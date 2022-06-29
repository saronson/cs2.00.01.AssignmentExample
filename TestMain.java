

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TestMain.
 *
 * @author  Steve Aronson
 * @version 1.0
 */
public class TestMain
{
  public static void main(String args[]) {
    TestMain test = new TestMain();
    test.testTest();
  }
    public static boolean trace = true;
    private static void failure(String str)
    {
        class Error extends RuntimeException{
            public Error(String s) {
                super(s);
            }

            @Override
            public Throwable fillInStackTrace() {
                return this;
            }
        }
        if (!trace) {
            System.out.println(str);
            throw new Error(str);
        } else {
            fail(str);
        }
    }

    /**
     * Default constructor for test class TestMain
     */
    public TestMain()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public  void testTest() {
        Main main = new Main();
        assertEquals(5, main.test());
    }
    
    
    
}
