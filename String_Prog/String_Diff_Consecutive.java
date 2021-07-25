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
public class String_Diff_Consecutive {
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int x,y;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;i<str.length()-1;j++)
            {
                x=str.charAt(i);
                y=str.charAt(j);
                int z=y-x;
                System.out.print(str.charAt(i)+""+z);
                break;
            }
            if(i+1==str.length())
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}
/*
    Sample Input :- pepCODinG

    Sample Output :- p-11e11p-45C12O-11D37i5n-39G
*/