package slidingWindow.variableSizeSlidingWindow;


public class LongestSubstringOneDistinct {
    public static void main(String[] args) {

        String s="aaaaaaaabbcccccd";
        System.out.println(method(s));


    }


    private static int method(String s){

        int left=0;
        int maxLength=0;

        for(int right=0;right<s.length();right++) {
            if (s.charAt(right)!=s.charAt(left)){
                left=right;
            }
        maxLength=Math.max(maxLength,right-left+1);

        }

        return maxLength;
    }

}

/*
If characters are same → extend window
If character changes → reset window
 */
