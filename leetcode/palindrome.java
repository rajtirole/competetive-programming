public class palindrome{
    public static void main(String[] args) {
       boolean a= isPalindrome(1);
       System.out.println(a);
       
    }
    public static boolean isPalindrome(int x) {
        int i=0;
       int[] arr= new int[10];
       boolean ispalindrome=true;
       if(x<0){
           return false;
       }
       while(x>0){
           arr[i]=x%2;
           x=x/10;
           i++;
       }   
       int k=i-1; 
       i=0;
       while(ispalindrome&&i<=k){
           if(arr[i]==arr[k]){
               ispalindrome=true;
           }
           else{
               ispalindrome=false;
           }
           i++;
           k--;
       }
       if(ispalindrome){
           return true;
       }
      
       
       else{
           return false;
       }
       
       
   }
}