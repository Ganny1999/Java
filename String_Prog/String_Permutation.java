/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Prog;

import java.util.*;
import java.io.*; 
/**
 *
 * @author Ganesh Nalegave
 */
public class String_Permutation {

    public static int fact(int n)
    {
        int val=1;
        for(int i=1;i<=n;i++)
        {
            val=val*i;
        }
        return val;
    }
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String str=new String();
        str=scn.nextLine();
        int n=str.length();
        for(int i=0;i<fact(n);i++)
        {
            StringBuilder sb = new StringBuilder(str);
            int temp=i;
            for(int j=n;j>=1;j--)
            {
               
                int que=temp/j;
                int rem=temp%j;
                System.out.print(sb.charAt(rem));
                sb.deleteCharAt(rem);
                temp=que;
            }
            System.out.println();
        }
    }
}





/*
while(cnt<fact(str.length()))
        {
            int n=str.length();
            //int i=cnt;
            while(n>0)
            {
                int temp=cnt;
                int que=temp/n;
                int rem=temp%n;
                System.out.print(str.charAt(rem));
                n--;
            }
            System.out.println();
            cnt--;
        }
*/