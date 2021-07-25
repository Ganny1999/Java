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
public class Wave_Array {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int arr[][] = new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        for(int j=0;j<c1;j++)
        {
            for(int i=0;i<r1;i++)
            {
                if(j%2==0)
                {
                    System.out.println(arr[i][j]);
                }
                else
                {
                    int k=r1-1;
                    while(k>=0)
                    {
                        System.out.println(arr[k][j]);
                        k--;
                    }
                    break;
                }
            }
        }
    }
}
