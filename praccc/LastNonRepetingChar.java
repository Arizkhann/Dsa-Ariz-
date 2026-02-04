package praccc;

import java.util.HashMap;

public class LastNonRepetingChar {

    public static void main(String[] args) {

        String s="aabbccddeewwqqbbhsaes";

    lastNonRepChar(s);
    }

    public  static void lastNonRepChar(String s){

        char arr[]=s.toCharArray();

        HashMap<Character ,Integer> map=new HashMap<>();


        for(int i=0;i<arr.length;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }

        for(int i=arr.length-1;i>=0;i--){
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }





    }


}
