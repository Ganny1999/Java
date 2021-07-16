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
public class Pallindrome_SubString {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int flag=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                int x=i;
                int y=j-1;
                while(x<=y){
                    if(str.charAt(x)==str.charAt(y))
                    {
                        x++;
                        y--;
                        flag=1;
                    }
                    else{
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                {
                    System.out.println(str.substring(i, j));
                }
            }
        }
    }
}
