/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reccursion;

import static Reccursion.Display_Array_Reverse.displayArr;
import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class Display_Max_In_Array {
    public static int maxOfArray(int[] arr, int idx){
        int val=arr.length;
        if(idx==arr.length-1)
        {
            return arr[idx];
        }
        int max=maxOfArray(arr,idx+1);
       
        if(max>arr[idx])
        {
            return max;
        }
        else{
            return arr[idx];
        }
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int x=maxOfArray(arr,0);
    System.out.println(x);
    }
}
/*

Input :-  6
          15 30 40 4 11 9

Output :- 40

*/