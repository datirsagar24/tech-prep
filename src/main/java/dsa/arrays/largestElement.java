package dsa.arrays;

public class largestElement {

   /* Given an array of integers nums, return the
    value of the largest element in the array*/

    // time complexity : O(n)
    // Space Complexity : O(1)

    public static void main(String[] args) {

        int[] arr = {2, 5, 1, 3, 0,8,-8};
        int largestElement = findLargestElement(arr);
        System.out.println("Largest Element From Array is :"+largestElement);
    }

    private static int findLargestElement(int[] arr) {
        int largestElement = arr[0];
        for(int num : arr){
            if(num>largestElement)
                largestElement=num;
        }

        return largestElement;
    }
}
