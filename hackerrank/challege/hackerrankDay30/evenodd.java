package challege.hackerrankDay30;

public class evenodd {
    public static void main(String[] args) {
        int n;
        n=24;
        if(n%2!=0){
            //even
            System.out.println("Weird");
        }
        else if((n>=2&&n<=5)||(n>20)){
            System.out.println("Not Weird");
        }
        else if(n>=6&&n<=20){
            System.out.println("Weird");
        } 
    }
    
}
