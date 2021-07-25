/*
 1. You've to check whether a given number is prime or not.
 2. Take a number "t" as input representing count of input numbers to be tested.
 3. Take a number "n" as input "t" number of times.
 4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
 */
package pepcoding;

import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class PepCoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);

    // write ur code here
    int t = scn.nextInt();

    while (t > 0)
    {
      int flag = 1;
      int n = scn.nextInt();
      for (int i = 2; i < n; i++)
      {
        if (n % i == 0)
        {
          flag = 0;
          break;
        }
      }
      if (flag == 1)
      {
        System.out.println("prime");
      }
      else {
        System.out.println("not prime");
      }
      t--;
    }
    }
    
}
