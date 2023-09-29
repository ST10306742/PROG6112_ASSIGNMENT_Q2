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
public class DangerousCreaturesTest {
    
    public DangerousCreaturesTest() {
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
     * Test of calcPrice method, of class DangerousCreatures.
     */
    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        DangerousCreatures instance = new DangerousCreatures();
        instance.calcPrice();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of compileCode method, of class DangerousCreatures.
     */
    @Test
    public void testCompileCode() {
        System.out.println("compileCode");
        DangerousCreatures instance = new DangerousCreatures();
        instance.compileCode();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of showInfo method, of class DangerousCreatures.
     */
    @Test
    public void testShowInfo() {
        System.out.println("showInfo");
        DangerousCreatures instance = new DangerousCreatures();
        instance.showInfo();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveAge method, of class DangerousCreatures.
     */
    @Test
    public void testSaveAge() {
        System.out.println("saveAge");
        DangerousCreatures instance = new DangerousCreatures();
        int expResult = 0;
        int result = instance.saveAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveName method, of class DangerousCreatures.
     */
    @Test
    public void testSaveName() {
        System.out.println("saveName");
        DangerousCreatures instance = new DangerousCreatures();
        String expResult = null;
        String result = instance.saveName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
