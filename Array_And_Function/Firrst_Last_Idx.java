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
public class Firrst_Last_Idx {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        int flag=-1;
        
        int l=0,h=arr.length-1;
        int j=0,k=0;
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(data < arr[mid])
            {
                h=mid-1;
            }
            else if(data > arr[mid]){
                l=mid+1;
            }
            else{
                j=k=mid;
                break;
            }
        }
        while(arr[j]==data)
        {
            
            j--;
        }
        while(arr[k]==data)
        {
            k++;
        }
        if(flag==1)
        {
            System.out.println(j+1);
            System.out.println(k-1);
        }
        else{
            j=k=flag;
            System.out.println(j);
            System.out.println(k);
        }
    }
}
