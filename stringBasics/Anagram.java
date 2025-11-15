package stringBasics;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

String s="ariz";
String s2="Zira";



        if(sortString(s,s2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not ");
        }


    }


    public static boolean sortString(String str,String str2){

        if(str.length()!=str2.length()){
            return false;
        }

        str=str.toLowerCase();
        str2=str2.toLowerCase();
        char[] arr1 = str.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);


    }


}
