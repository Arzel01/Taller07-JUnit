/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.taller08;

import calculatorsmp.CalculatorSMP;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CltControl
 */
public class CalculatorSMPTest {
    
    public CalculatorSMPTest() {
    }

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of main method, of class CalculatorSMP.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        CalculatorSMP.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    @DisplayName("ID: 011 - Probar Solve que funcione correcto")
    void testSolve(){
        assertEquals("68-83+42+88=115",Operations.Solve(Operations.MakeFormula())   ,"No son iguales los strings");
    }
    @Test
    @DisplayName("ID: 012 - Probar que solve no funcione con oraciones")
    void testSolveSentences(){
        assertNull(Operations.Solve("Hola"),"El valor deberia ser nulo");
    }
    @Test
    @DisplayName("ID: 013 - Probar que solve recibe numero sin operacion")
    void testSolveOnlyNumber(){
        assertEquals("27",Operations.Solve("27"),"Los valores no son iguales");
    }
    @Test
    @DisplayName("ID: 014 - Probar solve con una cadena vacía")
    void testSolveVoid(){
        assertEquals("=",Operations.Solve(""),"Debe lanzar una excepcion");
    }
    @Test
    @DisplayName("ID: 015 - Probar que Solve no acepta nulos ")
    void testSolveNull(){
        assertEquals("null",Operations.Solve(null), "Debe lanzar una excepcion");
    }
}
