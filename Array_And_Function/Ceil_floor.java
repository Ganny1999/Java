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
public class Ceil_floor {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        
        int l=0,h=n-1,mid=0;
        int ceil=0,floor=0;
        while(l<=h)
        {
            mid =(l+h)/2;
            if(d<arr[mid])
            {
                h=mid-1;
                ceil=arr[mid];
            }
            else if(d>arr[mid]){
                l=mid+1;
                floor=arr[mid];
            }
            else
            {
                ceil=arr[mid];
                floor=arr[mid];
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }
}
