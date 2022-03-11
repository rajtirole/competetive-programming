package javaprepration;

import java.util.Scanner;

public class recusion9 {
    public static void main(String[] args) {
    //     int n=5;
    //     int ans=factorial(n);
    //     System.out.println(ans);
        
    // }
    // static int factorial(int n){
    //     int ans=1;
    //     while(n==1){
    //         ans=ans*factorial(n-1);

    //     }
    //     return ans;
    
        Scanner scan = new Scanner(System.in);
        System.out.println( factorial(scan.nextInt()) );
    }
        
    public static long factorial( int n){
    
        return (n == 1) ? 1 : n*factorial(n-1) ;
    }
    }
    

