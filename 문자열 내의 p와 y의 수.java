class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] string_temp = s.split("");
        int y_count = 0;
        int p_count = 0;
        
        for ( String str : string_temp ){
            if ( str.equals("y") || str.equals("Y") ){
                y_count++;
            }
            else if ( str.equals("p") || str.equals("P") ){
                p_count++;
            }
            else{
                continue;
            }
        }
        
        if ( y_count != p_count){
            answer = false;
        }

        return answer;
    }
}