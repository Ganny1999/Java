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
public class Benjeman_Bulb {
        public static void main(String[] args) {
    // write your code here  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int arr[]=new int[n+1];
    for(int i=0;i<n;i++)
    {
        arr[i]=0;
    }
        for(int i=1;i<=n;i++)
        {
            int j=i;
            while(j<n)
            {
                 if(arr[j]==0)
                {
                    arr[j]=1;
                }
                else{
                    arr[j]=0;
                }
                j=j+i;
            }
        }
        for(int i=1;i<=n;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println(i);
            }
        }
    }
}
