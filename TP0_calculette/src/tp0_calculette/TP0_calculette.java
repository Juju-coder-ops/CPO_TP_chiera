/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author julie
 */
public class TP0_calculette 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("""
                            Please enter the operator: 
                                   1) add 
                                   2) substract 
                                   3) multiply 
                                   4) divide 
                                   5) modulo """);
        int operateur = sc.nextInt();
        System.out.println("Saisissez le premier nombre");
            if (operateur < 1 || operateur > 5) 
            {
            System.out.println("Error: invalid operator choice (must be between 1 and 5).");
            } 
            else 
            {
                int operande1 = sc.nextInt(); 
                System.out.println("Saisissez le deuxieme nombre");
                int operande2 = sc.nextInt(); 
                switch (operateur)
                {
        
                 case 1 -> System.out.println("The result is : " + (operande1 + operande2));

                 case 2 -> System.out.println("The result is : " + (operande1 - operande2));

                 case 3 -> System.out.println("The result is : " + (operande1 * operande2));
                
                 case 4 -> System.out.println("The result is : " + (operande2 % operande1)); 
                }
            }
    }
}