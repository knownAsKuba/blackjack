/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstsubroutineprogram;

import java.util.Scanner;

/**
 *
 * @author ba248309 Name: Jakub Bartlewski Teachers Name: Mr. Yeung Course Code:
 * ICS\ Date Started: Date Completed: Description:
 */
public class MyFirstSubroutineProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner keyedInput = new Scanner(System.in);

        double lengthNum = 0;

        double widthNum = 0;

        double average1 = 0, average2 = 0, average3 = 0, average4 = 0;

        double y1Num = 0, y2Num = 0;

        double x1Num = 0, x2Num = 0;

        double sideAnum = 0, sideBnum = 0;

        double baseNum = 0;

        double hieghtNum = 0;

        int choice = 0;

        do {

            System.out.println("Welcome to my First Subroutine Program");

            System.out.println(" If you would like to find The Perimeter of Rectangel - Enter 1 ");
            System.out.println(" If you like to find the Average of 4 Numbers - Enter 2 ");
            System.out.println(" If you would like midpoint of a line using 2 points - Enter 3 ");
            System.out.println(" If you like to find the Missing hypotnuse of Triangle - Enter 4");
            System.out.println(" If you would like to find the Area of Traingle - Enter 5");
            System.out.println("If you would like to exit -Enter 6");
            choice = keyedInput.nextInt();

            if (choice == 1) {

                System.out.println("Pleaase enter the length of the Rectangle ");

                lengthNum = keyedInput.nextDouble();

                System.out.println(" Please enter the width of the Rectangle ");

                widthNum = keyedInput.nextDouble();

                perimeterofRect(lengthNum, widthNum);
            }
            if (choice == 2) {

                System.out.println("To find the Average - enter four grades/numbers");

                average1 = keyedInput.nextDouble();
                average2 = keyedInput.nextDouble();
                average3 = keyedInput.nextDouble();
                average4 = keyedInput.nextDouble();

                averageofNum(average1, average2, average3, average4);
            }

            if (choice == 3) {

                System.out.println(" To find the Midpoint of a Line - Enter X1, X2 Y1, Y2 ");

                System.out.println("What is the value of X1 ? ");
                x1Num = keyedInput.nextDouble();
                System.out.println("What is the value of X2 ? ");
                x2Num = keyedInput.nextDouble();
                System.out.println("What is the value of Y1 ? ");
                y1Num = keyedInput.nextDouble();
                System.out.println("What is the value of Y2 ? ");
                y2Num = keyedInput.nextDouble();
                
                findingmidpoint (x1Num , x2Num, y1Num , y2Num);
            }
            
            if (choice==4) {
                
                System.out.println(" To find the Hypotnuse of the Traingle : enter a value for side A and side B");
                System.out.println(" What is the value of Side A?");
                sideAnum = keyedInput.nextDouble();
                System.out.println(" What is the value of Side B");
                sideBnum = keyedInput.nextDouble();
                
                findhypot(sideAnum,sideBnum);
                
            }
            
            if (choice==5)  {
                
             System.out.println("To find the Area of the Triangle - enter the base and the hieght");
             
             System.out.println("What is the hieght of the triangle? ");
             
             hieghtNum = keyedInput.nextDouble();
             
             System.out.println(" What is the base of the triangle? ");
             
             baseNum = keyedInput.nextDouble();
             
             areaoftriangle(hieghtNum,baseNum);
                
                
                
            }
            
            

        } while (choice != 6);{
        System.out.println("Goodbye");
    }
        
    }

    public static void perimeterofRect(double LNum, double WNum) {
        double perimeter = 2 * (LNum + WNum);

        System.out.println("The perimeter of the Rectangle is " + perimeter);

    }

    public static void averageofNum(double n1, double n2, double n3, double n4) {
        double finalaverage = (n1 + n2 + n3 + n4) / 4;

        System.out.println("The average of the numbers is " + finalaverage);
    }
    
    public static void findingmidpoint (double XN1, double XN2, double YN1, double YN2){
        
        double finalxvalue = (XN1 + XN2) /2;
        double finalyvalue = (YN1 + YN2) /2;
        System.out.println("The midpoint of the line is located on x:" + finalxvalue +"and y:" + finalyvalue);
        
        
    }
    
    public static void findhypot (double Sidea, double Sideb){
        
        double hypotnuse = (Sidea * Sidea + Sideb * Sideb);
        
        System.out.println("The value of the hypotnuse is " + hypotnuse);
        
        
        
        
    }
    
    public static void areaoftriangle (double hNum, double bNum) {
        
        double area = (hNum * bNum) / 2;
        
        System.out.println(" The Area of the Triangle is " + area);
        
        
        
        
        
    }
            

}
