/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reccursion;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class Tower_of_hanoi {
    public static void toh(int n, int t1id, int t2id, int t3id){
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t1id=0,t2id=0,t3id=0;
        for(int i=0;i<n;i++)
        {
            t1id=sc.nextInt();
            t2id=sc.nextInt();
            t3id=sc.nextInt();
        }
        toh(n,t1id,t2id,t3id);
    }
}
