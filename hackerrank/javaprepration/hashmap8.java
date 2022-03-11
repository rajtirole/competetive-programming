package javaprepration;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer> myMap = new HashMap<String,Integer>(); 
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            in.nextLine();
            myMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.nextLine();
            if(s.length()==0){
                break;
            }
            if(myMap.get(s) == null)
            System.out.println("Not found");
            else {
                System.out.println(s + "=" + myMap.get(s));
            }
           
        }
        in.close();

    }
    
}
