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
public class SubSet_Array {
    public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<Math.pow(2, n);i++)
        {
            String set="";
            int temp=i;
            for(int j=arr.length-1;j>=0;j--)
            {
                int k=temp%2;
                temp=temp/2;
                if(k==0)
                {
                    set="-\t" + set;
                }
                else{
                    set=arr[j]+ "\t" +set;
                }
                
            }
            System.out.println(set);
        }
    }
}
