package javaprepration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class array2d11 {
    public static void main(String args[]){
        Scanner sr= new Scanner(System.in);
        int[][] arr= new int[6][6];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=sr.nextInt();
            }
        }
        int sum=0;
        int max=0;
        System.out.println(Arrays.deepToString(arr));
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum=arr[i][j];
            }
        }
        double average=100;
       
    }
}