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
public class InverseNo {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);        
//idx- 54321
        int n;
        //op   15342
        n=sc.nextInt();
        int num=n,i=0;
        
        while(num!=0){
            num=num/10; 
            i++;
        }
        num=n;
        int idx=1;
        int arr[]=new int[i+1];
        while(num!=0)
        {
            int d=num%10;
            arr[d]=idx;
            idx++;
            num=num/10;
        }
        for(int j=i;j>0;j--)
        {
            System.out.println(arr[j]);
        }

        }
    
}
