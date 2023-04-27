package pl.polsl.zadanie13.controller;

import pl.polsl.zadanie13.*;
import pl.polsl.zadanie13.model.Model;
import pl.polsl.zadanie13.model.MyException;
import pl.polsl.zadanie13.view.View;
import java.util.*;

/**
 *
 * @author Jakub Włodarski
 * @version 2.0
 */

public class Controller {
   
    private View v;
    private Model m;
    
    public Controller(){
        v = new View();
        m = new Model();
    }
    
    /**
     * Delegates text modification to model, handles exceptions, controls output through View class
     * 
     * @param argsCount number of command line arguments
     * @param text command line arguments
     */
    public void textModifier(int argsCount, String... text){
        String modType = "", modifiedText = "";
        List<String> beforeList = new ArrayList<>();
        List<String> afterList = new ArrayList<>();

        if (argsCount == 1){
            modType = text[0];
            v.oneParameter();
            Scanner scan = new Scanner(System.in);
            String stringToModify = scan.nextLine();
            
            beforeList.add(stringToModify);
            try{
                modifiedText = m.modifyText(modType, stringToModify);
            } catch (MyException e){
                System.out.println(e);
            }
            afterList.add(modifiedText);
        }
        else if(argsCount == 0){
            v.noParameters();
            int choice = 0;
            Scanner scan = new Scanner(System.in);
            int i=0;
            do{
                if(i>0) System.out.println("Incorrect input. Try again: ");
                try{
                    choice = Integer.parseInt(scan.nextLine());
                } catch (Exception e){
                    System.out.println("Incorrect input. Try again: ");
                    continue;
                }
                i++;
            } while (choice != 1 && choice != 2);
              
            if(choice == 1) {modType = "c";}
            else {modType = "d";}
            
            v.noParametersContinued();
            String stringToModify = scan.nextLine();
            beforeList.add(stringToModify);
            try{
                modifiedText = m.modifyText(modType, stringToModify);
            } catch (MyException e){
                System.out.println(e);
                modifiedText = e.toString();
            }
            afterList.add(modifiedText);
        }
        else
            modType = text[0];
        
        for(int i = 1; i<text.length; i++){
            beforeList.add(text[i]);
            try{
                modifiedText = m.modifyText(modType, text[i]);
            } catch (MyException e){
                System.out.println(e);
            }
            afterList.add(modifiedText);
        }
        
        int dispCount = 1;
        for(String i : afterList){
            if(modifiedText == "Error")
                v.displayError(afterList.indexOf(i)+1);
            else if (modifiedText == "ModifError")
                v.displayModifError(afterList.indexOf(i)+1);
            else
                v.displayModifiedText(afterList.indexOf(i)+1, i);
        }
    }
 
}
