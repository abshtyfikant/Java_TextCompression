package pl.polsl.zadanie13;

import pl.polsl.zadanie13.*;
import pl.polsl.zadanie13.controller.Controller;
import java.util.*;
/**
 *
 * @author Jakub Włodarski
 * @version 3.0
 */

//main class
public class Zadanie13 {

    /**
     * 
     * @param args[0] type of string modification ('c' or 'd')
     * @param args[1] string intended for modification (compression or decompression)
     */
    public static void main(String[] args) {

        Controller c = new Controller();
        if(args.length == 0) c.textModifier(0);
        else c.textModifier(args.length, args);
        
    }
}