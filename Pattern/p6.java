/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pattern;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class p6 {
     public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    // write ur code here
    int sp = 1;
    int st = n / 2;
    for (int i = 1; i <= n; i++)
    {
      for (int j = 0; j <= st; j++)
      {
        System.out.print("*\t");
      }
      for (int j = 0; j < sp; j++)
      {
        System.out.print("\t");
      }
      for (int j = 0; j <= st; j++)
      {
        System.out.print("*\t");
      }
      if (i <= (n / 2))
      {
        st--;
        sp = sp + 2;
      }
      else {
        st++;
        sp = sp - 2;
      }
      System.out.println();
    }
  }
}
