public class palindrome6 {
    public static void main(String[] args) {
        boolean a=ispalindrome(123);
        //palindrome using int reverse
        System.out.println(a);
    }
    static boolean ispalindrome(int x){
        if(x<0){
            return false;
        }
        int  r=Integer.reverse(x);
        if(x==r){
            return true;
        }
        else {
            return false;
        }
    }
}
