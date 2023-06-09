// PROBLEM 26 : Remove Duplicates from Sorted Array

// SOLUTION:

class Solution {
    static int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i =1;i<nums.length;i++){
            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
        }
        return k+1;
    }

    public static void main(String[] args){
        int nums[] = {2,2,3,3,4,6,6};
        int k = removeDuplicates(nums);

        for(int i=0;i < k;i++){
            System.out.print(nums[k]+" ");
        }
    }
}
