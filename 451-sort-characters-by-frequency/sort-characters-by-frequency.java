class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < s.length() ;i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
         List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        String x ="";
       for(char ch : list){
         int find = map.get(ch);
         for(int i = 0; i < find ;i++){
            x+=ch;
         }
       }
       return x;
    }
}