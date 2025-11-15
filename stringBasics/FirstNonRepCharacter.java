package stringBasics;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepCharacter {
    public static void main(String[] args) {

        String str="swiss";
        char result=nonRepChar(str);

        if(result!='-'){
            System.out.println("first non rep character is -> "+result);
        }else {
            System.out.println("no found ");
        }

    }


    public static char nonRepChar(String  str){

        str=str.toLowerCase();

        LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();

        int count=0;

        for(int i=0; i<str.length();i++){

            char ch= str.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);}


            for(Map.Entry<Character,Integer> entry: map.entrySet()){
                if(entry.getValue()==1){
                    return entry.getKey();
                }
            }




        return '-';


    }

}
