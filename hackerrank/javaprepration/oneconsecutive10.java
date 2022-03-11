package javaprepration;

public class oneconsecutive10 {
    public static void main(String[] args) {
        int k=2;
        int[] arr={1,1,0,0,1};
        int zerocnt=0;
        int i=0;
        int ans=0;
        for(int j=0; j<arr.length; j++){
            if(arr[j]==0){
                zerocnt++;
            }
            while(zerocnt>k){
                if(arr[i]==0){
                    zerocnt--;
                }
                i++;
            }
            //zero count<=k
            ans=Math.max(ans, i-j+1);

        }
        System.out.println(ans);
    }
    
}
