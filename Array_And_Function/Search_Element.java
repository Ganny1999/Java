/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_And_Function;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class Search_Element {
    public static void main(String[] args){
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for (int i = 0; i < n; i++)
    {
      arr[i] = sc.nextInt();
    }

    int d = sc.nextInt();
    int flag = -1;
    for (int i = 0; i < n; i++)
    {
      if (arr[i] == d)
      {
        flag = i;
      }
    }
    if (flag != -1)
    {
      System.out.println(flag);
    }
    else {
      System.out.println(flag);
    }
  }
}
