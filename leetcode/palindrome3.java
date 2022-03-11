public class palindrome3 {
    public static void main(String[] args) {
        int x = 121;
        boolean j = isPalindrome(x);
        System.out.println(j);
    }

    public static boolean isPalindrome(int x) {
        // int reverse=0;
        // int temp=x;
        // if(x<0){
        // return false;
        // }
        // int remaining;
        // int i=0;
        // while(x>0){
        // remaining=x%10;
        // reverse=(reverse*10)+remaining;
        // x=x/10;
        // }
        // if(reverse==temp){
        // return true;
        // }
        // else{
        // return false;
        // }
        int r, sum = 0, temp;
        int n = 454;// It is the number variable to be checked for palindrome

        temp = n;
        while (n > 0) {
            r = n % 10; // getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            return true;
        else
            return false;
    }
}
