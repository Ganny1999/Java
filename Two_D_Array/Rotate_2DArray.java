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
public class Rotate_2DArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        int ex[][]=new int[size][size];
      for(int i=0;i<size;i++)
      {
          for(int j=0;j<size;j++)
          {
              arr[i][j]=sc.nextInt();
          }
      }
      int x=0,y=size-1;
      for(int i=0;i<size;i++)
      {
          for(int j=0;j<size;j++)
          {
              ex[x][y]=arr[i][j];
              x++;
          }
          y--;
          x=0;
      }
      for(int i=0;i<size;i++)
      {
          for(int j=0;j<size;j++)
          {
              System.out.print(ex[i][j]+" ");
          }
          System.out.println();
      }
    }
}
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16