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
public class p_10 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=(n/2);
        int x = 0;
        for(int i=0;i<n;i++)
        {
            if(i<=n/2)
            {
                for(int k=0;k<n;k++)
                {
                    x=(n/2)+i;
                
                    if(k==j || k==x)
                    {
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    } 
                     
                }
                j--;
            }
            else{
                
                x--;
                j=i-(n/2);
                for(int k=0;k<n;k++)
                {
                    
                   if(k==j || k==x)
                    {
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print("   ");
                    }  
                    
                }
            }
           
             System.out.println();
        }
    }
}
