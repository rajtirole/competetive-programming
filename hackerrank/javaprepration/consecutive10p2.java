package javaprepration;

public class consecutive10p2 {
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,1,1,1,1,1,0,1,0};
        int count=0;
        int maxCons=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                count++;
            }
            else{
                count=0;
            }
            maxCons= Math.max(count, maxCons);
        }
        System.out.println(maxCons);
    }
    
}
