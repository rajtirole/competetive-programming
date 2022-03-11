public class palindrome2 {
    public static void main(String[] args) {
        int x=4554;
        int sum=0;
        int rem;
        int temp=x;
        while(x>0){
            rem=x%2;
            sum=(sum*10)+rem;
            x=x/10;
        }
        if(sum==temp){
            System.out.println("palindorme");
        }
        else{
            System.out.println("not");
        }
    }
    
}
