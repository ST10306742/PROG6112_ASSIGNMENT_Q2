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
public class AquariumTest {
    
    public AquariumTest() {
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
     * Test of calcPrice method, of class Aquarium.
     */
    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        Aquarium instance = new Aquarium();
        instance.calcPrice();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compileCode method, of class Aquarium.
     */
    @Test
    public void testCompileCode() {
        System.out.println("compileCode");
        Aquarium instance = new Aquarium();
        instance.compileCode();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showInfo method, of class Aquarium.
     */
    @Test
    public void testShowInfo() {
        System.out.println("showInfo");
        Aquarium instance = new Aquarium();
        instance.showInfo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveAge method, of class Aquarium.
     */
    @Test
    public void testSaveAge() {
        System.out.println("saveAge");
        Aquarium instance = new Aquarium();
        int expResult = 0;
        int result = instance.saveAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveName method, of class Aquarium.
     */
    @Test
    public void testSaveName() {
        System.out.println("saveName");
        Aquarium instance = new Aquarium();
        String expResult = null;
        String result = instance.saveName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
