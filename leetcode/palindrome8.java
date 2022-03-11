public class palindrome8 {
    public static void main(String[] args) {
        boolean a=ispalindrome("jjjj");
        System.out.println(a);
    }

    static boolean ispalindrome(String s){
        int i=0; 
        boolean ispalindrome=true;
        int j=s.length()-1;
        while(i<=j&&ispalindrome){
            if(s.charAt(i)==s.charAt(j)){
                ispalindrome=true;
            }
            else{
                ispalindrome=false;  
            }
        }
        return ispalindrome?true:false;
    }

}
