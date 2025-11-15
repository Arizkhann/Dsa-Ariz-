package dsaArray;

import java.util.HashSet;

public class CommonElement {
    public static void main(String[] args) {

        int arr1[]={1,2,3,4,1};
        int arr2[]={3,2,6,9};

        HashSet<Integer> commonEle=interElements(arr1,arr2);
        System.out.println(commonEle);

    }

    public  static HashSet<Integer> interElements(int arr1[],int arr2[]){


        HashSet<Integer> set1=new HashSet<>();


        for(int num:arr1){
            set1.add(num);
        }


        HashSet<Integer> intersection=new HashSet<>();

        for(int nums:arr2){
            if(set1.contains(nums)){
                intersection.add(nums);
            }
        }



        return intersection;

    }

}
