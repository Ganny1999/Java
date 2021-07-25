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
public class String_Toggle_Case {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
                int x;
                char y;
                for(int i=0;i<str.length();i++)
                {
                    if(str.charAt(i)<=90)
                    {
                        x=str.charAt(i)+32;
                        y =(char)x;
                        System.out.print(y);
                    }
                    else{
                        x=str.charAt(i)-32;
                        y=(char)x;
                        System.out.print(y);
                    }
                }
	}
}
