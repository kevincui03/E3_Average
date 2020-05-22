/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3_average;

import java.io.*;
import java.util.*;

/**
 *
 * @author kevincui03
 */
public class E3_Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner k = new Scanner(System.in);

        String fileName, line, line2;

        // THIS SECTION ALLOWS USER TO INPUT FILE NAME AND CHECKS FOR ERRORS
        System.out.print("Input file name: "); // allows user to input file to read from
        fileName = k.nextLine(); //gets the file name from user

        Scanner file;

        try {
            file = new Scanner(new File(fileName)); // opens the file
        } catch (IOException e) {
            System.out.println(fileName + " : File not found");
            return; // checks for error
        }

        
        
        // THIS SECTION READS THE FILE, STORES NUMBERS IN THE ARRAY, AND CALCULATES THE AVERAGE
        line = file.nextLine(); // read the first line from the file
        int lines = Integer.parseInt(line); // changes the ASCII data from the file to numeric data 

        int numbers[] = new int[lines]; // an array to store all of the numbers

        int sum = 0;// the sum of all of the numbers in the file
        for (int i = 0; i < lines; i++) { // for loop reads every line from file
            line = file.nextLine(); // reads the line
            int num = Integer.parseInt(line); // converts each line from the file from ASCII to numeric data
            numbers[i] = num; // stores each number in the array
            sum = sum + num; // adds to sum of all numbers
        }

        int average = sum / lines;
        System.out.println("The average is " + average);

        
        
        // THIS SECTION DETERMINES WHETHER EACH MARK IS BELOW/ABOVE/EQUAL TO AVERAGE
         for (int i = 0; i < lines; i++) { 
            // line = file.nextLine(); 
            int num2 = numbers[i]; 
            
            if (num2 < average) {
                System.out.println(num2 + " is below the average");
            } else if (num2 == average){
                System.out.println(num2 + " is equal to the average");
            } else if (num2 > average) {
                System.out.println(num2 + " is above the average");
            } //outputs each mark
            
        }
    }
}
