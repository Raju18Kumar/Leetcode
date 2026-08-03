class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int max = 0;
       for(int i = 0;i < s.length() ; i++){
           for(int j = i ; j < s.length() ; j++){
            String h = s.substring(i,j+1);
             if(check(h)){
                if(h.length() > max){
                  ans = h;
                  max = h.length();
             }
           } 
        }
    }
     return ans;
    }
        public static boolean check(String ss){
            int left = 0;
             int right = ss.length()-1;
            while (left < right) {
            if (ss.charAt(left) != ss.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}