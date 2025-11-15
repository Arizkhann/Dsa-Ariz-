package twoPointer;

public class Palindrome {
    public static void main(String[] args) {


        int number=1321;
        String str=Integer.toString(number);

        int start=0;
        int end=str.length()-1;
        Boolean flag=false;


        while (start<end){

            if(str.charAt(start)==str.charAt(end)){
                flag=true;



            }else {
                flag=false;
            }

            start++;
            end--;

        }

        if(flag==true){
            System.out.println("palindrome");
        }else {
            System.out.println("not");
        }


    }
}
