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
public class Prime_Factorial {
    public static void main(String[] args) {
  // write your code here  
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int i=2;
      while(n>=2)
      {
          if(n%i==0)
          {
              n=n/i;
              System.out.print(i+" ");
          }
          else{
              i++;
          }
          
      }
      
 }
}
