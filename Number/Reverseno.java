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
public class Reverseno {
    public static void main(String[] args) {
     // write your code here  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int d=0,r=0;
    while(n!=0)
    {
        d=n%10;
        r=(r*10)+d;
        System.out.println(r);
        n=n/10;
    }
    }
}
