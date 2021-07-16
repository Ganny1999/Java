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
public class Substraction_Array {
     public static void main(String[] args){
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int a1[]=new int[n1];
    for(int i=0;i<n1;i++)
    {
        a1[i]=sc.nextInt();
    }
    int n2=sc.nextInt();
    int a2[]=new int[n2];
    for(int i=0;i<n2;i++)
    {
        a2[i]=sc.nextInt();
    }
    int sub[]=new int[n2];
    
    int i=n1-1,j=n2-1,k=sub.length-1;
    int c=0;
    while(k>=0)
    {
        int d=0;
        int a1_val = i>=0 ? a1[i]:0;
        
        if(a2[j]+c >=a1_val)
        {
            d=a2[j]+c-a1_val;
            c=0;
        }       
        else{
            d=a2[j]+c+10-a1_val;
            c=-1;
        }
        sub[k]= d;
        i--;
        j--;
        k--;
    }
    int idx=0;
    while(idx<sub.length)
    {
        if(sub[idx]==0)
        {
            idx++;
        }
        else{
            break;
        }
    }
    for(int l=idx;l<n2;l++)
    { 
        System.out.print(sub[l]+" ");
    }
}
}
