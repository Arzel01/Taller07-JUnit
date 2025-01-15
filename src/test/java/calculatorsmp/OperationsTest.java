/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculatorsmp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author CltControl
 */
public class OperationsTest {
    
    public OperationsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of MakeFormula method, of class Operations.
     */
    @Test
    public void testMakeFormula() {
        System.out.println("MakeFormula");
        String expResult = "";
        String result = Operations.MakeFormula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


        @Test
    public void testMakeFormulaNumbersInRange() {
        String formula = Operations.MakeFormula();
        String[] numbers = formula.split("[\\+\\-\\*/]");
        System.out.println("Todos los numeros deben estar entre 1-99");
        for(String s : numbers){
            int number = Integer.parseInt(s);
            assertTrue(number>=1 && number<= 99, "Numero fuera de rango: " + number);
        }
    }
    
    @Test
    public void testMakeFormulaNumberOfOperations(){
        String formula = Operations.MakeFormula();
        System.out.println(formula);
        int operations = formula.replaceAll("[\\+\\-\\*/]", "").length();
        assertTrue(operations >= 1 && operations <= 8, "Operadores fuera de rango:" + operations);
    }
    
    @Test
    public void testMakeFormulaRandomness(){
        Set<String> formulas = new HashSet<>();
        for(int i = 0; i < 100; i++){
            formulas.add((Operations.MakeFormula()));
        }
        assertTrue(formulas.size() > 1, "Las formulas no son aleatorias");
    }
    
    @Test
    public void testMakeFormulaStructure(){
        String formula = Operations.MakeFormula();
        assertTrue(formula.matches("([1-9][0-9]?|99)([\\+\\-\\*/])([1-9][0-9]?|99)"), "Estructura invalida: "+formula);
        assertFalse(formula.contains("++") || formula.contains("--") || formula.contains("**") || formula.contains("//"),
                "Formula contiene operadores consecutivos: "+formula);
    }
    
    @Test
    public void testMakeFormulaNoSpaces(){
        String formula = Operations.MakeFormula();
        
        assertTrue(formula.contains(" "), "La formula no debe contener espacios: "+ formula);
        assertFalse(formula.matches("[0-9+\\-\\*/]"), "La formla contiene caracteres invalidos: "+formula);
    }
    /**
     * Test of Solve method, of class Operations.
     */
    @Test
    public void testSolve() {
        System.out.println("Solve");
        String formula = "";
        String expResult = "";
        String result = Operations.Solve(formula);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testSolve_nonNumber() {
        String formula = "_+z+?";
        assertThrows(IllegalArgumentException.class, () -> Operations.Solve(formula));
    }
}
