public class palindrome4 {
    public static void main(String[] args) {
        boolean a=ispalindrome(123);
        System.out.println(a);
    }
    static boolean ispalindrome(int x){
        int rem;
        int temp=x;
        int reverse=0;
        if(x<0){
            return false;
        }
        while(x>0){
            rem=x%10;
            x=x/10;
            reverse=(reverse*10)+rem;
        }
        if(reverse==temp){
            return true;
        }
        else{
            return false; 
        }
    }
}
