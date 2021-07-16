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
public class Span_Of_Array {
    public static void main(String[] args){
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    
    int min=arr[0],max=arr[0];
    
    for(int i=1;i<n;i++)
    {
        if(arr[i]>max)
        {
            max=arr[i];
        }
        else if(arr[i]<min)
        {
            min=arr[i];
        }
    }
    int result=max-min;
    System.out.println(result);
 }
}
