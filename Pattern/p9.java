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
public class p9 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n-1;
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<n;j++)
             {
                 int x=j-k;
                 if(i==j || i+j==k)
                 {
                     System.out.print(" * ");
                 }
                 else{
                     System.out.print("   ");
                 }
                // else if()
             }
             System.out.println();
             
        }
//        for(int i=0;i<n;i++)
//        {
//             for(int j=0;j<n;j++)
//             {
//                 int x=j-k;
//                 if(i==j || x==0)
//                 {
//                     System.out.print(" * ");
//                 }
//                 else{
//                     System.out.print("   ");
//                 }
//                // else if()
//             }
//             k--;
//             System.out.println();
//             
//        }
        
    }
}
