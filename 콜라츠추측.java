class Solution {
    public int solution(int num) {
        int answer = 0;
        double tmp = num;
        
        for ( int i = 0; i <= 500; i++ ){
            if ( tmp == 1 ){
                answer = i;
                break;
            }
            if ( tmp % 2 == 0){
                tmp = tmp / 2;
            }else{
                tmp = ( tmp * 3 ) + 1;
            }
            if ( i == 499 ){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}