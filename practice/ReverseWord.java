package practice;

public class ReverseWord {
    public static void main(String[] args) {


        String s= "Ananya Routray";


        String words[]=s.split(" ");

        for(String i : words){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i= words.length-1;i>=0;i--){
            System.out.print(words[i]+" ");
        }




    }
}
