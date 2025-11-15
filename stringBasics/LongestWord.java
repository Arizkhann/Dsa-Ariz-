package stringBasics;

public class LongestWord {
    public static void main(String[] args) {

        String sentence="Ariz is a fantastic boi";

       String bada= longestWord(sentence);

        System.out.println(bada);

    }

    public static String longestWord(String str){

        String[] words=str.split(" ");

        String longest="";


       for(String word:words){

           if(word.length()>longest.length()){
               longest=word;
           }

       }


        return longest;
    }


}
