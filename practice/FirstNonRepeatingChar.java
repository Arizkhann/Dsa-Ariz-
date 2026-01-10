package practice;

import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {


    String s="aaebbcddff";

        HashMap<Character,Integer> map=new HashMap<>();

        for(char ch:s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(char ch :s.toCharArray()){
            if(map.get(ch)==1){
                System.out.println("first non repeating char is "+ch);
                break;
            }
        }


    }
}
