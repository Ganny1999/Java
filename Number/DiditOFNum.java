/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepcoding;
import java.*;
import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class DiditOFNum {
    public static void main(String[] args) {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt=0;
    while (n > 0)
    {
     n=n/10;
     cnt++;  
    }
    
    int d= (int)pow(10,cnt-1);
     System.out.println(d);
     int q = n/d;
     System.out.println(q);
//   12
  }
    
}
