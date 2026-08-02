class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        res.add(ans);
        for(int i = 1 ; i < num ; i++){
            ArrayList<Integer> table = new ArrayList<>();
            table.add(1);
           for(int j = 1 ; j < i ; j++){
            table.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
           }
           table.add(1);
           res.add(table);
        }
        return res;
    }
}