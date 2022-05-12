public class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int div = 0;
        String temp = Integer.toString(x);
        String[] str = temp.split("");
        
        for ( String tmp : str){
            div += Integer.parseInt(tmp);
        }
        
        if ( x % div != 0){
            answer = false;
        }
        return answer;
    }
}class 하샤드수 {
    
}
