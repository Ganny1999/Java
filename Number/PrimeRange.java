/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepcoding;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class PrimeRange {
    public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int low =6;
    int high =24;
    boolean flag;
    for (int i = low; i <= high; i++)
    {
      flag = true;
      for (int j = 2; j<i; j++)
      {
        if (i % j == 0)
        {
          flag = false;
          break;
        }
      }
      if (flag == true)
      {
        System.out.println(i);
      }
    }
  } 
}
