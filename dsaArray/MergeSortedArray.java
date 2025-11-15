package dsaArray;

public class MergeSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,7,8,9,10};

        int [] newMergedArr=mergedArr(arr1,arr2);

        for(int nums:newMergedArr){
            System.out.print(nums+" ");
        }


    }

    public static int[] mergedArr(int arr1[],int arr2[]){

        int mergedArr[]=new int[arr1.length+arr2.length];

        int i=0,j=0,k=0;

        while (i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                mergedArr[k++]=arr1[i++];
            }else {
                mergedArr[k++]=arr2[j++];
            }
        }

        while (i<arr1.length){
            mergedArr[k++]=arr1[i++];
        }

        while ((j<arr2.length)){
            mergedArr[k++]=arr2[j++];
        }

        return mergedArr;
    }


}
