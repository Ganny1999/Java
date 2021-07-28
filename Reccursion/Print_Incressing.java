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
public class Print_Incressing {
    public static void main(String[] args){
        // write your code here
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n==0)
        {
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
}
/*
Input :- 5

Output :-   1
            2
            3
            4
            5
*/