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
/*
        Saddle Point :- 1.The row value in matrix is minimum and the column value of matrix in minimum.
                        2.Every matrix contain only one sabble point.
*/
public class Saddle_Point_2DArray {
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
    
    int min=arr[0][0];
        int i=0;
        while(i<n)
        {
            min=arr[i][0];
            //System.out.print(arr[i][0]);
            for(int j=1;j<n;j++)
            {
                if(min > arr[i][j])
                {
                    min=arr[i][j];
                }
            }
            for(int k=0;k<n;k++)
            {
                if(min<=arr[k][i])
                {
                    continue;
                }
                else{
                    break;
                }
            }
            i++;
        }
        if(min>=0)
        {
            System.out.print(min);
        }
        else{
            System.out.print("Invalid input");
        }
          
    }
}

// Input - 11 12 13 14 21 22 23 24 31 32 33 34 41 42 43 44 
// Input -  1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
// Output - 13