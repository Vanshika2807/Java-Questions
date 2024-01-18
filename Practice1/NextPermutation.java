class Solution {
    public void nextPermutation(int[] nums) {

        //this loop is to find just big no from its next 
        //start from last position
        int index=0;
        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

        //this loop is to find just next big no from nums[index]
 // we have started from last as it is in decreasing order always from index+1 to last
        int index2=0;
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]>nums[index]){
                index2=i;
                break;
            }
        }

        //this loop is when array is in decreasing order
        //comment this if and run test case
        if(index==index2){
        reverse(0,nums.length-1,nums);
         return;
            }

        int temp=nums[index];
        nums[index]=nums[index2];
        nums[index2]=temp;

//we want array in increasing order from index+1 so done swapping as it is in decreasing order
        reverse(index+1,nums.length-1,nums);


    }

    public static void reverse(int start,int end,int []nums){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}