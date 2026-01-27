package praccc;

import java.util.HashMap;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String s="aabbssccc";

        System.out.println(freq(s));


    }

    public static HashMap<Character,Integer> freq(String s){

        HashMap<Character,Integer> map=new HashMap<>();

        char arr[]=s.toCharArray();


        for(int i=0;i< arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }



        return map;
    }


}
