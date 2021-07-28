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
public class Index_Last {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        System.out.print(firstIndex(arr,n-1,x));
    }
    public static int firstIndex(int[] arr, int idx, int x){
        
        if(idx<0)
        {
            return -1;
        }
        else if(arr[idx]==x){
            return idx;
        }
        return firstIndex(arr,idx-1,x);
    }
}
/*
Input:-
        6
        15 11 40 4 4 9
        4
Output :-
        4
*/