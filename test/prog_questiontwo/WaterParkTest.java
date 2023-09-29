/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_questiontwo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author shail
 */
public class WaterParkTest {
    
    public WaterParkTest() {
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
     * Test of calcPrice method, of class WaterPark.
     */
    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        WaterPark instance = new WaterPark();
        instance.calcPrice();
        // TODO review the generated test code and remove the default call to fail.
     //   fail("The test case is a prototype.");
    }

    /**
     * Test of compileCode method, of class WaterPark.
     */
    @Test
    public void testCompileCode() {
        System.out.println("compileCode");
        WaterPark instance = new WaterPark();
        instance.compileCode();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showInfo method, of class WaterPark.
     */
    @Test
    public void testShowInfo() {
        System.out.println("showInfo");
        WaterPark instance = new WaterPark();
        instance.showInfo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveAge method, of class WaterPark.
     */
    @Test
    public void testSaveAge() {
        System.out.println("saveAge");
        WaterPark instance = new WaterPark();
        int expResult = 0;
        int result = instance.saveAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveName method, of class WaterPark.
     */
    @Test
    public void testSaveName() {
        System.out.println("saveName");
        WaterPark instance = new WaterPark();
        String expResult = null;
        String result = instance.saveName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
