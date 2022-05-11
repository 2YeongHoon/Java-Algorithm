class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        answer = subString(s);
        return answer;
    }
    
    public boolean subString(String s){
        String[] tmpString = s.split("");
        String regExp = "^[0-9]";
        
        if ( !(tmpString.length == 6 || tmpString.length == 4) ){
            return false;
        }
        
        for (String tmp : tmpString){
            if ( !tmp.matches(regExp) ){
                return false;
            }
        }
    
        return true;
    }
}