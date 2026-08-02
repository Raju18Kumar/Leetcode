class Solution {
    public List<Integer> getRow(int row) {
         ArrayList<ArrayList<Integer>> triangle = fun(row);
        return triangle.get(row);
    }
    public static ArrayList<ArrayList<Integer>> fun(int num){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
        list.add(ans);
        for(int i = 1 ; i <= num ; i++){
           ArrayList<Integer> res = new ArrayList<>();
           res.add(1);
           for(int j = 1 ; j < i ; j++){
               res.add(list.get(i-1).get(j)+list.get(i-1).get(j-1));
           }
           res.add(1);
           list.add(res);
        }
        return list;
    }
}