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
public class Print_Decressing {
     public static void main(String[] args) throws Exception {
        // write your code here
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }
}

/*
Input :- 5

Output :-   5
            4
            3
            2
            1
*/