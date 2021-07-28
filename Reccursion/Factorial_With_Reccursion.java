/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reccursion;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class Factorial_With_Reccursion {
      public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(factorial(n));
    }

    public static int factorial(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
}
/*
Input :- 5

Output :- 120
*/