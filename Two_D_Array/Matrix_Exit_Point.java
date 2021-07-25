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
public class Matrix_Exit_Point {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
        int pos=0;
        
        int i=0,j=0;
        while(true)
        {
            pos=(pos + arr[i][j]) % 4;
            if(pos==0)   //East
            {
                j++;
            }
            else if(pos == 1)  // South
            {
                i++;
            }
            else if(pos==2)     // West
            {
                j--;
            }
            else if(pos == 3)   // North
            {
                i--;
            }
            
        if(i<0){
            i++;
            break;
        }
        else if(j<0){
            j++;
            break;
        }
        if(i==row){
            i--;
            break;
        }
        else if(j==col){
            j--;
            break;
        }
        }
        
        System.out.println(i+ " "+j);
    }
}
// 0 0 1 0 1 0 0 0 0 0 0 0 1 0 1 0