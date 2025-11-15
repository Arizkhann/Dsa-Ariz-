package stringBasics;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String str="engineer";

findDuplicate(str);



    }


    public static void findDuplicate(String str){

        str=str.toLowerCase();

        HashMap<Character,Integer> map=new HashMap<>();


        // Step 2: count frequency of each character
        for(int i=0;i<str.length();i++){

            char ch= str.charAt(i);

            if(ch==' '){
                continue;
            }


            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        //printing

        System.out.println("duplicates are ");

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" -> "+ entry.getValue()+" ");
            }
        }





    }


}
