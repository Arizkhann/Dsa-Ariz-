package stringBasics;

import java.util.HashMap;

public class FirstRepeatingChars {
    public static void main(String[] args) {

        String s="abcdbcb";

        char arr[]=s.toCharArray();

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:arr){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }


        for (char ch:arr){
            if(map.get(ch)>1){
                System.out.println(ch);
                break;
            }
        }


    }
}
