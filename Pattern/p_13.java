/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class p_13 {
     
     public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        //write your code here
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
            int f=1;
            for(int j=0;j<=i;j++)
            {
                
                System.out.print(f  +"\t");
                int f1=f*(i-j)/(j+1);
                f=f1;
            }
            System.out.println();
        }
    }
}
