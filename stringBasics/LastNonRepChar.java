package stringBasics;

import java.util.HashMap;

public class LastNonRepChar {
    public static void main(String[] args) {

        String s="abcdtbcb";

        char arr[]=s.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


       for(int i=arr.length-1;i>=0;i--){

           if(map.get(arr[i])==1){
               System.out.println(arr[i]);
               break;
           }


       }



    }
}
