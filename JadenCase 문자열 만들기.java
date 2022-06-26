import java.util.*;

class Solution {
    public String solution(String s) {
        String[] strArr = s.split(" ");
        String answer = "";
        
        if(s.substring(s.length() - 1, s.length()).equals(" ")) {
           strArr[strArr.length-1] += " ";
        }

        for ( int i = 0; i < strArr.length; i++ ){
            if ( !strArr[i].equals("") ){
                answer += toUpperCaseFirst(strArr[i].toLowerCase());
            }

            if ( i < strArr.length - 1 ) {
                answer += " ";
            }
        }

        // System.out.print(answer);
        return answer;

    }

    public static String toUpperCaseFirst(String val){
        char[] charArr = val.toCharArray();
        char tmp = Character.toUpperCase(charArr[0]);
        charArr[0] = tmp;
        return new String(charArr);
    }
}
