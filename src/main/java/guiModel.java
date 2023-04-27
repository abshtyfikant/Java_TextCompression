/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SuperStudent.PL
 */
public class guiModel {
    private String textBefore, textAfter;
    String errorMsg, errorMsgModif;
    
    public guiModel() {
        textBefore = "";
        textAfter = "";
        errorMsg = "Error";
        errorMsgModif = "ModifError";
    }
    
    /**
     * 
     * @param modType 1st command line argument, determines whether text should be compressed ('c') or decompressed ('d')
     * @param text 2nd command line argument, string intended for modification
     * @return modified string or error message
     */
    public String modifyText(String modType, String text){
        if(modType.length() != 1)
            return errorMsg;
        if (modType.charAt(0) == 'c'){
            this.compressText(text);
            return textAfter;
        }
        if (modType.charAt(0) == 'd'){
            this.decompressText(text);
            return textAfter;
        }
        else
            return errorMsgModif;
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
       }
    
    /**
     * Method for string decompression
     * 
     * @param x string intended for decompression
     */
    private void decompressText(String x){
            textAfter = "";
            textBefore = x;
            boolean isErr = false;
            char currentChar = x.charAt(0);
            int textLength = x.length(), a = 1;
            if(textLength%2 != 0){
                textAfter = errorMsg;
                isErr = true;
            }
            
            for(int i=0; i<textLength; i+=2){
                currentChar = x.charAt(i);
                try{
                    a = Integer.parseInt(String.valueOf(x.charAt(i+1)));
                } catch (Exception e){
                    textAfter = errorMsg;
                    isErr = true;
                }
                
                if(!isErr){
                for(int j=0; j<a; j++)
                    textAfter += currentChar;
                }
            }
       }
}
