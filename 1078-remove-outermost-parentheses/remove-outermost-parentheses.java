class Solution {
    public String removeOuterParentheses(String s) {
        int c = 0;
        String x = "";
        for(int i = 0 ; i < s.length() ;i++){
            if(s.charAt(i)==')') c--;
            if(c!=0) x+=s.charAt(i);
            if(s.charAt(i)=='(') c++;
        }
        return x;
    }
}