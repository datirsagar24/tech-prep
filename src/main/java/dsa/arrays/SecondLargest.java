package dsa.arrays;

public class SecondLargest {

    /*Given an array of integers nums, return the second-largest element in the array.
    If the second-largest element does not exist, return -1.*/

    // time complexity : O(n)
    // Space Comlexity : O(1)

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        int secondLargest = findSecondLargest(arr);

        System.out.println("Second Largest From Array is :"+secondLargest);

    }

    private static int findSecondLargest(int[] arr) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if(arr.length<2){
            return -1;
        }

        for(int num : arr){
            if(num > largest) {
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num!=largest )
                secondLargest=num;
        }

        return secondLargest==Integer.MIN_VALUE?-1:secondLargest;

    }
}
