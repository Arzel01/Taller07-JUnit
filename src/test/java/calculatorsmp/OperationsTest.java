/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package calculatorsmp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
    
    
     @Test
    @DisplayName("ID 001 - Prueba que verifica que la formula retornada no sea null")
    public void testMakeFormulaNotNull(){
        String operacion = Operations.MakeFormula();
        assertNotNull(operacion);
        assertFalse(operacion.isEmpty());
    }
    
    @Test
    @DisplayName("ID 002 - Prueba que verifica que la formula retornada es mayor a 3 caracteres")
    public void testMakeFormulaTamanio(){
        String operacion = Operations.MakeFormula();
        assertTrue(operacion.length() > 3); 
    }
    
     @Test
    @DisplayName("ID 003 - Prueba que verifica que si la formula tiene una division por 0")
    public void testMakeFormulaDivididaPorCero(){
        String operacion = Operations.MakeFormula();
        assertFalse(operacion.contains("/0"), "La formula tiene una division por 0: "+ operacion);
    }
    
    @Test
    @DisplayName("ID 004 - Prueba que verifica que si la formula tiene una division por 0")
    public void testTrueMakeFormulaDivididaPorCero(){
        String operacion = Operations.MakeFormula();
        assertTrue(operacion.contains("/0"), "La formula tiene una division por 0: "+ operacion);
    }
    
    @Test
    @DisplayName("ID 005 - Prueba que verifica que si la formula es vacia")
    public void testTrueMakeFormulaIsEmpty(){
        String operacion = Operations.MakeFormula();
        if(operacion.isEmpty()){
            fail("Se genero una formula vacia");
        }
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
