/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idwall.desafio.string;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Piercarlo
 */
public class IdwallFormatterIT {
    
    public IdwallFormatterIT() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
      /**
     * Test of format method, of class IdwallFormatter.
     */
    @org.junit.jupiter.api.Test
    public void testFormat() {
        System.out.println("format");
        String text = "In the beginning God created the heavens and the earth. Now the earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters.";
        IdwallFormatter instance = new IdwallFormatter();
        String expResult = "In the beginning God created the heavens\n" +
"and the earth. Now the earth was\n" +
"formless and empty, darkness was over\n" +
"the surface of the deep, and the Spirit\n" +
"of God was hovering over the waters.\n";
        String result = instance.format(text);
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @org.junit.jupiter.api.Test
    public void testJustify() {
        System.out.println("format");
        String text = "In the beginning God created the heavens and the earth. Now the earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters.";
        IdwallFormatter instance = new IdwallFormatter();
        String expResult = "In the beginning God created the heavens\n" +
"and the earth. Now the earth was\n" +
"formless and empty, darkness was over\n" +
"the surface of the deep, and the Spirit\n" +
"of God was hovering over the waters.\n";
        String result = instance.justify(text);
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
