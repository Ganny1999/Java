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
public class Spiral_Array {
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
        
        // SPIRAL ARRAY
        int cnt=0;
        int check=r1*c1;
        int minr=0,maxr=r1-1;
        int minc=0,maxc=c1-1;
        while(cnt < check)
        {
            for(int i=minr,j=minc;i<=maxr && cnt<check;i++)
            {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minc++;
            
            for(int j=minc,i=maxr;j<=maxc && cnt<check;j++)
            {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxr--;
            
            for(int i =maxr,j=maxc;i>=minr && cnt<check;i--)
            {
                System.out.println(arr[i][j]);
                cnt++;
            }
            maxc--;
            for(int j=maxc,i=minr;j>=minc && cnt<check;j--)
            {
                System.out.println(arr[i][j]);
                cnt++;
            }
            minr++;
        }
            
    }
}
//1 5 9 13 2 6 10 14 3 7 11 15 4 8 12 16