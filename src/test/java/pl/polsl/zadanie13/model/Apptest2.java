/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

package pl.polsl.zadanie13.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SuperStudent.PL
 */
public class Apptest2 {
    
    public Apptest2() {
    }
    
    private Model m; 
    
    @BeforeEach
    public void setUpClass() {
        m = new Model();
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    
    @AfterEach
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    // 
     
    /**
     * Tests compressText method through modifyText method
     * 
     * @param modType type of modification ('c' for compression)
     * @param input tested input
     * @param expected expected result
     */
    @ParameterizedTest
    @CsvSource({"c,aabbcc,a2b2c2", "c,wfxv,w1f1x1v1", "g,aabbcc,ERROR"})
    public void compressionTest(String modType, String input, String expected) {
        try{
            String actualText = m.modifyText(modType, input);
            assertEquals(expected, actualText, "Strings were not correctly compressed.");
        } catch (MyException e){
            return;
            //fail("Incorrect input detected.");
        }
    }
    
    /**
     * Tests decompressText method through modifyText method
     * 
     * @param modType type of modification ('d' for decompression)
     * @param input tested input
     * @param expected expected result
     */
    @ParameterizedTest
    @CsvSource({"d,a2b2c2,aabbcc", "d,asfs2,ERROR", "d,g5c1,gggggc", "g,aabbcc,ERROR"})
    public void decompressionTest(String modType, String input, String expected) {
        try{
            String actualText = m.modifyText(modType, input);
            assertEquals(expected, actualText, "Strings were not correctly compressed.");
        } catch (MyException e){
            return;
            //fail("Incorrect input detected.");
        }
    }
}
