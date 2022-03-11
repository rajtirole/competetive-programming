package javaprepration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     * 1. DOUBLE meal_cost
     * 2. INTEGER tip_percent
     * 3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        // double tip=(meal_cost*tip_percent)/100;
        // double tax=(tax_percent*tip_percent)/100;
        // double total_cost1=meal_cost+tip+tax;
        // // Math.round(total_cost1);
        // // int total_cost=(int)total_cost1;
        // // System.out.println(total_cost);
        // int round = (int)Math.round(total_cost1);
        // System.out.println(round);
        int totalCost = (int) Math.round(meal_cost +
                meal_cost * tip_percent / 100.0 +
                meal_cost * tax_percent / 100.0);
        System.out.println(totalCost);

    }

}

public class day2 extends Result {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        Result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();

    }

}
