/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adirael
 */
public class MainTest {

    public MainTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
    }

    /**
     * Test of printHello method, of class Main.
     */
    @Test
    public void testPrintHello() {
        System.out.println("printHello");
        String expResult = "Hello world!";
        String result = Main.printHello();
        assertEquals(expResult, result);
    }

}