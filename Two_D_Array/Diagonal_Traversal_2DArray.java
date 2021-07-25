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
public class Diagonal_Traversal_2DArray {
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
    int x=n-1;
    int i=0;
    while(i<n)
    {
        for(int j=0;j<n;j++)
        {
            int k;
            for(k=i;k<n;k++)
            {
                if(((i+j)-k)==0)
                {
                    System.out.print(arr[j][k]+" ");
                }
            }
        }
        i++;
    }
   }
}

// Input -  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
// Output - 1 6 11 16 2 7 12 3 8 4