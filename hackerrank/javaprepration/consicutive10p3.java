package javaprepration;

public class consicutive10p3 {
    public static void main(String[] args) {
        int k=2;
        int[] arr={1,1,0,0,1};
        int zerocount=0;
        int j=0;
        int ans=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zerocount++;
            }
            while(k<zerocount){
                if(arr[j]==0){
                zerocount--;
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        System.out.println(ans);
    }
    
}
