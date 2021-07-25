/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Two_D_Array;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class Search_in_2DArray {
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    
    int k=sc.nextInt();
    int i=0;
    int j=n-1;
    while(i<n && j>=0)
    {
        if(arr[i][j]==k)
        {
            System.out.println(i);
            System.out.println(j);
            return;
        }
        else if(k<arr[i][j])
        {
            j--;
        }
        else{
            i++;
        }
    }
    System.out.println("Not Found");
    }
}

/*
       *****My Logic****

    int x=0,y=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(arr[i][j]==k)
            {
                x=i;
                y=j;
                break;
            }
        }
    }
    if(arr[x][y]==k)
    {
        System.out.println(x);
        System.out.println(y);
    }
    else{
        System.out.println("Not Found");
    }
*/