class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int arrsum = 0;
        for(int i = 1 ; i <=nums.length ; i++){
             arrsum+=i;
        }
        for(int i = 0 ; i < nums.length ; i++){
             sum+=nums[i];
        }
        return arrsum-sum;
    }
}