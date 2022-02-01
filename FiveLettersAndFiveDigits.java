/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivelettersandfivedigits;
import java.util.Scanner;
/**
 * @author Rashmi Singh
 * Purpose : Validate and find whether the user has successfully entered 5 letter and 5 words
 * Date : 10th Oct 2021
 * Version : 1.0
 */
public class FiveLettersAndFiveDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string that contains atleast five letters and atleast five digits. ");
        str = input.nextLine();
        int letters = 0;
        int digits  = 0;
        
       
         do {
             
            for (int i=0; i<str.length(); i++)
           {
           char ch = str.charAt(i);
           if (ch >= 'a' && ch <='z' || ch >= 'A' && ch <= 'Z')
            {
              letters++;
            }                
           else if (ch >= '0' && ch <= '9')    
           {
               digits++;
           }
           }
           
           if(letters >= 5 && digits >= 5)
            {
            System.out.println("Congratulations! You have entered " + digits + " numbers and " + letters+ " letters.");
            break;
            }
           else
            {
           System.out.println("You have typed in "+ letters +" letters and "+ digits +" numbers. Please try again.");
           System.out.println("Enter the string with appropriate letters and numbers.");
           letters = 0;
           digits = 0;
           str = input.nextLine();
            }
        } while(letters < 5 || digits < 5);
       }
}


    



    
    
        

        
        

    

