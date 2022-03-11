package javaprepration;

import java.util.Arrays;
import java.util.Scanner;

public class consecutive10p4 {
    public static void main(String[] args) {
        // Scanner sr=new Scanner(System.in);
        // // int[] arr=new int[64];
        // int count=0;
        // int number;
        // int t=0;
        // int n=sr.nextInt();
        // while(n>0){
        //    number=n%2;
        //     n=n/2;
        //     // i++;
        //     if(number==1){
        //         count++;
        //         if(count>=t){

        //         t=count;
        //         }
        //     }
        //     else{
        //         count=0;
        //     }
        // }
        // // // System.out.println(Arrays.toString(arr));
        // // for(int j=i-1; j>=0;j--){
        // //     System.out.print(arr[j]);
            
        // // }
        // System.out.println(count);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int number=0,count=0,t=0;
    
    
        while(n>0)
            {
            number=n%2;
            n=n/2;
            if(number==1)
             {   count++;
               if(count>=t)
    
                t=count;
    
            }
            else{
    
                count=0;
            }   
        }
        // int max=Math.max(count, t);
    
        // System.out.println(max);
        System.out.println(t);
    
        
    }
    
}
