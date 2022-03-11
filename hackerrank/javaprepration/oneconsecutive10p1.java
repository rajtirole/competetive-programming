package javaprepration;

public class oneconsecutive10p1 {
    public static void main(String[] args) {
        int k=2;
        int[] arr={1,1,0,0,1};
        int zerocnt=0;
        int ans=0;
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zerocnt++;
            }
            while(zerocnt>k){
                if(arr[j]==0){
                    zerocnt--;
                }
                j++;
            }
            ans=Math.max(ans, j-i+1);

        }
        System.out.println(ans);
    }
    
}
