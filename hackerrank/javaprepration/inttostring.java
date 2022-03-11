package javaprepration;

import java.util.Scanner;

public class inttostring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        // String s = String.valueOf(n);
        String s = Integer.toString(n);
        // String s = "" + n;
    }

}
