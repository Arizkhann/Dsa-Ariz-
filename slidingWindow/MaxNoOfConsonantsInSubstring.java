package slidingWindow;

public class MaxNoOfConsonantsInSubstring {
    public static void main(String[] args) {

        String  s="abcdiiidef";
        int k=3;
        System.out.println(maxNoOfConsonants(s,k));



    }




    private static int maxNoOfConsonants(String s, int k){

        char arr[]=s.toCharArray();

        int wCount=0;
        int mCount=Integer.MIN_VALUE;

        for(int i=0;i<k;i++){
            if(isConsonant(arr[i])){
                wCount++;
            }
        }
        mCount=wCount;

        for(int i=k;i<arr.length;i++){

            if(isConsonant(arr[i])){
                wCount++;
            }

            if(isConsonant(arr[i-k])){
                wCount--;
            }

            mCount=Math.max(wCount,mCount);

        }


        return mCount;


    }



    private static boolean isConsonant(char ch) {

        if (ch >= 'a' && ch <= 'z') {
            return ch != 'a' && ch != 'e' && ch != 'i'
                    && ch != 'o' && ch != 'u';
        }

        return false;
    }






}
