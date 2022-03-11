package javaprepration;

import java.lang.reflect.Array;
import java.util.Scanner;

public class array7 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int a = sr.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i<a; i++) {
            arr[i] = sr.nextInt();

        }
        for (int i= arr.length-1; i>=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }
}
