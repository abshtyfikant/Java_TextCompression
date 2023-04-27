package pl.polsl.zadanie13.model;

import java.util.ArrayList;
import java.util.List;
import pl.polsl.zadanie13.*;
import pl.polsl.zadanie13.controller.Controller;

/**
 *
 * @author Jakub Włodarski
 * @version 2.0
 */

public class Model {
    private String textBefore, textAfter;
    private final String errorMsg, errorMsgModif;
    
    private List<String> afterList = new ArrayList<>();
    
    public Model() {
        textBefore = "";
        textAfter = "";
        errorMsg = "Error";
        errorMsgModif = "ModifError";
    }
    
    /**
     * Modifies given string
     * 
     * @param modType 1st command line argument, determines whether text should be compressed ('c') or decompressed ('d')
     * @param text 2nd command line argument, string intended for modification
     * @throws MyException when command line arguments were incorrect
     * @return modified string or error message
     */
    public String modifyText(String modType, String text) throws MyException{
        if(modType.length() != 1){
            return errorMsg;
        }
        else if (modType.charAt(0) == 'c'){
            this.compressText(text);
            return textAfter;
        }
        else if (modType.charAt(0) == 'd'){
            this.decompressText(text);
            return textAfter;
        }
        else{
            throw new MyException(errorMsgModif);
            //return errorMsgModif;
        }
    }
    
    /**
     * Method for string compression
     * 
     * @param x string intended for compression 
     */
    private void compressText(String x){
            textAfter = "";
            textBefore = x;
            int charCount=1;
            char currentChar = x.charAt(0);
            
            textAfter += currentChar;
            for(int i=1; i<x.length(); i++){
                if(x.charAt(i) == currentChar){
                    charCount++;
                }
                else{
                    currentChar = x.charAt(i);
                    textAfter += charCount;
                    
                    charCount = 1;
                    textAfter += currentChar;
                }
            }
            textAfter += charCount;
            afterList.add(textAfter);
       }
    
    /**
     * Method for string decompression
     * 
     * @param x string intended for decompression
     */
    private void decompressText(String x) throws MyException{
            textAfter = "";
            textBefore = x;
            char currentChar = x.charAt(0);
            int textLength = x.length(), a = 1;
            if(textLength%2 != 0){
                textAfter = errorMsg;
                throw new MyException(errorMsg);
            }
            
            for(int i=0; i<textLength; i+=2){
                currentChar = x.charAt(i);
                try{
                    a = Integer.parseInt(String.valueOf(x.charAt(i+1)));
                } catch (Exception e){
                    textAfter = errorMsg;
                    throw new MyException(errorMsg);
                }
                
                for(int j=0; j<a; j++)
                    textAfter += currentChar;
            }
            afterList.add(textAfter);
       }
    }
