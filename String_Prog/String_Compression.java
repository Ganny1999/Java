/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Prog;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class String_Compression {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s1="";
        String s2="";
        int i=0;
        while(i<str.length())
        {
            int cnt=0,j;
            for(j=i;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    cnt++;
                }
                else{
                    break;
                }
            }
            if(cnt>1)
            {
                s1= s1+ str.charAt(i) + cnt;
                s2=s2+str.charAt(i);
            }
            else{
                s1+=str.charAt(i);
                s2=s2+str.charAt(i);
            }
            i=j;
        }
        System.out.println(s2);
        System.out.println(s1);
        
    }
}
