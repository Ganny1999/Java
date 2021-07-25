/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepcoding;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class GCD_LCM {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        int on1=n1,on2=n2;
        while(n1%n2!=0)
        {
            int rem=n1%n2;
            n1=n2;
            n2=rem;
        }
        int gcd=n2;
        int lcm=(on1*on2)/gcd;
        System.out.println("GCD : "+gcd);
        System.out.println("LCM : "+lcm);
   }
    
}
