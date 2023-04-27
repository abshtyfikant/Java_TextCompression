/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pl.polsl.zadanie13.model;

/**
 * Custom exception
 * 
 * @author Jakub
 */
public class MyException extends Exception { 
    public MyException(String errorMessage) {
        super(errorMessage);
    }
}
