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
public class Display_Array_Reverse {
    public static void main(String[] args){
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    displayArr(arr,n-1);
  }

  public static void displayArr(int[] arr, int idx) {
      if(idx==-1)
      {
          return;
      }
      System.out.println(arr[idx]);
      displayArr(arr,idx-1);
      
  }
}
