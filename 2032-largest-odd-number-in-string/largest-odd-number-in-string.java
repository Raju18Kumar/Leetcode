class Solution {
    public String largestOddNumber(String num) {
        String sub = "";
        for(int i  = num.length()-1 ; i >=0 ;i--){
               if(num.charAt(i)%2==1){
                 return sub = num.substring(0,i+1);
               }
        }
        return "";
    }
}