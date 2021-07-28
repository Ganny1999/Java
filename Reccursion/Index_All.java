/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reccursion;

import static Reccursion.Index_First.firstIndex;
import java.util.Scanner;

/**
 *
 * @author Ganesh Nalegave
 */
public class Index_All {
   public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf){
        if(idx==arr.length)
        {
            return new int[fsf];
        }
        if(arr[idx]==x)
        {
            int[] iarr=allIndices(arr,x,idx+1,fsf+1);
            iarr[fsf]=idx;
            return iarr;
        }
        else{
            int[] iarr = allIndices(arr,x,idx+1,fsf);
            return iarr;
        } 
    }
}

/*
Input:-     6
            15 11 40 4 4 9
            4

Output :-   3 4
*/