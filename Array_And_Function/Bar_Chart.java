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
public class Bar_Chart {
    public static void main(String[] args){
    // write your code here
    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int arr[]=new int[n];
    int n=5;
    int arr[]=new int[n];
    arr[0]=3;
    arr[1]=1;
    arr[2]=0;
    arr[3]=7;
    arr[4]=5;
//    for(int i=0;i<n;i++)
//    {
//        arr[i]=sc.nextInt();
//    }
    int max=arr[0];
    for(int i=1;i<n;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
    }
//    System.out.println(max);
     for(int i=max-1;i>0;i--)
     {
         for(int j=0;j<n;j++)
         {
             if(i>arr[j])
             {
                 System.out.print(" ");
             }
             else{
                 System.out.print("*");
             }
         }
         System.out.println();
     }
   }
}
