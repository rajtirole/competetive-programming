package javaprepration;

import java.util.Scanner;

public class dataType {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        for(int i=0; i<6;i++){
        long a=-9223372036854775808L;
        long aa=-9223372036854775807L;
        Long N=scan.nextLong();
        if(N>=-127||N<=127){
            System.out.println(N+" can be fitted in\n*byte\n*short\n*int\n*long");
        }
        else if(N>=-32768||N<=32767){
            System.out.println(N+" can be fitted in\n*short\n*int\n*long");
            
        }
        else if(N>=-2147483648||N<=2147483647){
            System.out.println(N+" can be fitted in\n*int\n*long");
        
        }
        else if(N>=a||N<=aa){
            System.out.println(N+" can be fitted in\n*long");

        }
        else{
            System.out.println(N+" can't be fitted anywhere.");
        }
        }
    }
    
}
