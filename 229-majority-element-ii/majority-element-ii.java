class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
      int max = nums.length/3;
        for(int set : map.keySet()){
           if(map.get(set)>max){
            list.add(set);
           }
        }
        return list;
    }
}