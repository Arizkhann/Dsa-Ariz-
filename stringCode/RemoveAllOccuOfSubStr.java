package stringCode;

public class RemoveAllOccuOfSubStr {
    public static void main(String[] args) {

        String s="daabcbaabcbc";
        String part="abc";

        System.out.println(methodRem(s,part));




    }
    public static String methodRem(String s,String part){

       while(s.contains(part)) {
           int index = s.indexOf(part);


           s = s.substring(0, index) + s.substring(index + part.length());
       }
        return s;
    }



}
