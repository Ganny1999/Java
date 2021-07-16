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
public class p_16 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
    int n=scn.nextInt();
    for(int i=1;i<=n;i++)
    {
        int x=n*2;
        int y=1;
        for(int j=1;j<x;j++)
        {
            if(j<=i || i+j>=x)
            {
                if(j<=n)
                {
                    
                     System.out.print(y);
                     y++;
                     if(j==n)
                    {
                        y--;
                    }
                }
                else{
                    y--;
                    System.out.print(y);
                }
               
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
 }
    
}
