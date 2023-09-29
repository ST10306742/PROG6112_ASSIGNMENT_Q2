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
public class eSharkaTest {
    
    public eSharkaTest() {
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
     * Test of getCustomerCode method, of class eSharka.
     */
    @Test
    public void testGetCustomerCode() {
        System.out.println("getCustomerCode");
        eSharka instance = new eSharka();
        String expResult = null;
        String result = instance.getCustomerCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerCode method, of class eSharka.
     */
    @Test
    public void testSetCustomerCode() {
        System.out.println("setCustomerCode");
        String customerCode = "null";
        eSharka instance = new eSharka();
        instance.setCustomerCode(customerCode);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class eSharka.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        eSharka instance = new eSharka();
        String expResult = null;
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class eSharka.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = null;
        eSharka instance = new eSharka();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCatergory method, of class eSharka.
     */
    @Test
    public void testGetCatergory() {
        System.out.println("getCatergory");
        eSharka instance = new eSharka();
        String expResult = null;
        String result = instance.getCatergory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCatergory method, of class eSharka.
     */
    @Test
    public void testSetCatergory() {
        System.out.println("setCatergory");
        String catergory = null;
        eSharka instance = new eSharka();
        instance.setCatergory(catergory);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAge method, of class eSharka.
     */
    @Test
    public void testGetAge() {
        System.out.println("getAge");
        eSharka instance = new eSharka();
        int expResult = 0;
        int result = instance.getAge();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAge method, of class eSharka.
     */
    @Test
    public void testSetAge() {
        System.out.println("setAge");
        int age = 0;
        eSharka instance = new eSharka();
        instance.setAge(age);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class eSharka.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        eSharka instance = new eSharka();
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class eSharka.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        eSharka instance = new eSharka();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of calcPrice method, of class eSharka.
     */
    @Test
    public void testCalcPrice() {
        System.out.println("calcPrice");
        eSharka instance = new eSharka();
        instance.calcPrice();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of compileCode method, of class eSharka.
     */
    @Test
    public void testCompileCode() {
        System.out.println("compileCode");
        eSharka instance = new eSharka();
        instance.compileCode();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of showInfo method, of class eSharka.
     */
    @Test
    public void testShowInfo() {
        System.out.println("showInfo");
        eSharka instance = new eSharka();
        instance.showInfo();
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of compileReceipt method, of class eSharka.
     */
    @Test
    public void testCompileReceipt() {
        System.out.println("compileReceipt");
        eSharka instance = new eSharka();
        String expResult ="FINAL RECIEPT: \n"+
                   "-------------------------------------------------------"+
                   "\nTotal People: "+1+
                   "\nDate of booking: "+"12/04/2024"+
                   "\nTotal Cost: R"+163.0+
                   "-------------------------------------------------------";
        /*
        select 1 person
        any name
        age younger than 12
        date = 12/04/2024
        select aquarium-->walk in
        */
        String result = instance.compileReceipt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
