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
public class p3 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int sp=n-1;
        int st=1;
        while(n>st)
        {
            for(int i=0;i<sp;i++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<st;j++)
            {
                System.out.print("* ");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}
