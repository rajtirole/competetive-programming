public class palindrome5 {
    public static void main(String[] args) {
        //palindrome 
        boolean a = ispalindrome(1234);
        System.out.println(a);
    }
    public static boolean ispalindrome(int x){
        String a=Integer.toString(x);
        if(x<0){
            return false;
        }
        int i=0;
        boolean ispalindrome=true;
        int j=a.length()-1;
        while(i<=j&&ispalindrome){
            if(a.charAt(i)==a.charAt(j)){
                ispalindrome=true;
            }
            else{
                ispalindrome= false;
            }
            i++;
            j--;

        }
        return ispalindrome?true:false;
    }
}
