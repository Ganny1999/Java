/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pepcoding;

import java.util.*;

/**
 *
 * @author Ganesh Nalegave
 */
public class RotateNumber {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int k=sc.nextInt();
    
    int num=n,cnt=0;

    while(num>0)
    {
        num=num/10;
        cnt++;
    }
    k=k%cnt;
    if(k<0)
    {
        k=k+cnt;
    }
    int div=1,mul=1;
    for(int i=1;i<=cnt;i++)
    {
        if(i<=k)
        {
            div=div*10;
        }
        else{
            mul=mul*10;
        }
    }
    
    int q=n/div;
    int r=n%div;
    
    n=(r*mul)+q;
    System.out.println(n);
}
}
