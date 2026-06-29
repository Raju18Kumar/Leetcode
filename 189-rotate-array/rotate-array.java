class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        check(nums,0,nums.length-1);
        check(nums,0,k-1);
        check(nums,k,nums.length-1);
    }
    public static void check(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            }
    }
}