/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubes.powers.squares;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class CubesPowersSquares {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner(System.in);
        
        
       int cubedNum;
       
       int finalcubedNum;
       
       int squaredNum;
       
       int finalsquaredNum;
       
       int powerNum;
       
       int primaryNum;
       
       int finalprimaryNum;
       
       int choice;
       
       
       System.out.println("If you would like to find the sqaure of a number type 1 ");
       
       System.out.println("If you would like to find the cube of a number type 3");
       
       System.out.println("If you would like to find the value of any number to any power type 3");
       
       System.out.println("If you would like to exit the counter type 4");
       
       System.out.println("Please neter your choice");
       
       choice = keyedInput.nextInt();
       
      while (choice !=4);
      
      
      {
          
       choice = 1;
       System.out.println("What number do you want squared?");
       squaredNum = keyedInput.nextInt();
       finalsquaredNum = squaredNum ^ 2;
       System.out.println("The final squared Number is" + finalsquaredNum);
          
       choice = 2;
       System.out.println("What number do you want cubed?");
       cubedNum = keyedInput.nextInt();
       finalcubedNum = cubedNum ^ 3;
       System.out.println("The final value of the number cubed" + finalcubedNum);
          
          
        choice = 3;
        System.out.println("Choose a Number");
        primaryNum = keyedInput.nextInt();
        System.out.println("To what power would you like to see this number multiplyed by?");
        powerNum = keyedInput.nextInt();
        
        
        
      
      
      
      
      
      
      }
     
     
     
     
     
     
     
     
          
          
          
          
          
          
          
      }
      
      
              
       
       
     
       
       
       
       
        
    }
    
}
