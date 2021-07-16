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
public class p4 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int st=n;
        int sp=0;
        while(sp<n)
        {
            for(int i=0;i<sp;i++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<st;j++)
            {
                System.out.print("* ");
            }
        st--;
        sp++;
        System.out.println();
        }
        
    }
}
