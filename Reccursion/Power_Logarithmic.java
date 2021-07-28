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
public class Power_Logarithmic {
    public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int n = sc.nextInt();
    System.out.println(power(x, n));
  }

  public static int power(int x, int n) {
    if (n == 0)
    {
      return 1;
    }
    int np2 = power(x, n / 2);
    int np = np2 * np2;
    if (n % 2 == 1)
    {
      np = np * x;
    }
    return np;
  }
}

/*
Input :-    2
            5

Output :-   32
*/