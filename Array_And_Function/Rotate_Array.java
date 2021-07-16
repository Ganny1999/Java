/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_And_Function;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class Rotate_Array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        k=k%n;
        if(k<0)
        {
            k=n+k;
        }
        int a[]=new int[n];
        int x=0;
        for(int i=n-k;i<n;i++)
        {
            a[x]=arr[i];
            x++;
        }
        //System.out.print(x);
        int y=0;
        while(x<n)
        {
            a[x++]=arr[y++];
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
