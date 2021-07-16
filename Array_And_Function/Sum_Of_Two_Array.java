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
public class Sum_Of_Two_Array {
    public static void main(String[] args){
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int a1[]=new int[n1];
    for(int i=0;i<n1;i++)
    {
        a1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int a2[]=new int[n2];
    for(int i=0;i<n2;i++)
    {
        a2[i]=sc.nextInt();
    }
    int x;
    if(n1>n2) 
    {
        x=n1;
    }
    else{
       x=n2; 
    }
    int a3[]=new int[x];
    int i=n1-1,j = n2-1,k=x-1;
    int car=0;
    while(k>=0)
    {
        int d=car;
        if(i>=0)
        {
            d+=a1[i];
        }
        if(j>=0)
        {
            d+=a2[j];
        }
        car=d/10;
        d=d%10;
        a3[k]=d;
        i--;
        j--;
        k--;
    }
    if(car==1)
    {
        System.out.print(car);
    }
    for(int a=0;a<x;a++)
    {
        System.out.print(a3[a]+" ");
    }
    
}
}
/*   My logic

while(k>=0 && i>=0 && j>=0)
    {
        int val=car+a1[i]+a2[j];
        if(val<=9)
        {
            a3[k]=val;
            car=0;
        }
        else{
            int d=val%10;
            a3[k]=d;
            
            car=val/10;
            //System.out.print(car+" ");
        }
        i--;
        j--;
        k--;
    }
    while(i>=0)
    {
        a3[k]=a2[i];
        k--;
        i--;
    }
    while(j>=0)
    {
        a3[k]=a2[j];
        k--;
        j--;
    }
*/