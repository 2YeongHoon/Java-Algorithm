class Solution {
    boolean solution(String s) {
        int left = 0;
        int right = 0;
        boolean answer = true;

        for ( int i = 0; i < s.length(); i++ ){
            char bracket = s.charAt(i);
            if ( bracket == ')' ){
                left++;
            }else{
                right++;
            }
            if ( left > right ){
                answer = false;
                break;
            }
        }
        if ( left != right ){
            answer = false;
        }

        return answer;
    }
}