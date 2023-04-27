/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.zadanie13.view;

import java.util.Scanner;
import pl.polsl.zadanie13.*;

/**
 *
 * @author Jakub Włodarski
 * @version 2.0
 */
public class View {
    
    public View(){}
    
    /**
     * Displays modified text.
     * 
     * @param n output index
     * @param x modified text to display
     */
    public void displayModifiedText(int n, String x){
         System.out.println(n + ". " + x);
    }
    
    /**
     * Displays error message.
     * 
     * @param n output index
     */
    public void displayError(int n){
        System.out.println(n + ". Incorrect format.");
    }
    
    /**
     * Displays error message regarding to 1st command line argument.
     * 
     * @param n output index
     */
    public void displayModifError(int n){
        System.out.println(n + ". Incorrect format. As first parameter you can only set 'd' for decompression or 'c' for compression.");
    }
    
    /**
     * Displays information about available modifications
     */
    public void noParameters(){
        String newLine = System.lineSeparator();
        System.out.println("No parameters provided. Available modifications:" + newLine + "1) Compression" + newLine +
                "2) Decompression" + newLine + newLine + "Your choice: ");
    }
    
    /**
     * Displays message asking user for a text input
     */
    public void noParametersContinued(){
        System.out.println("Write a string you wish to modify: ");
    }
    
    /**
     * Displays message asking user for a text input
     */
    public void oneParameter(){
        System.out.println("Only one correct parameter provided. Please write string for chosen modification: ");
    }
}
