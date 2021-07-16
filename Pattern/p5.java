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
public class p5 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int st=1;
        int sp=n/2;
        
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<sp;j++)
            {
                System.out.print("   ");
            }
            for(int k=0;k<st;k++)
            {
                System.out.print(" * "); 
            }
            if(i<=(n/2))
            {
                st=st+2;
                sp--;
            }
            else{
                st=st-2;
                sp++;
            }
            System.out.println(); 
        }
    }
    
}
