class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int tmp = 0;
        for (int idx = 1; idx <= 9; idx++){
            tmp = idx;
            for (int num: numbers){
                if ( num == idx ){
                    tmp = 0;
                    break;
                }
            }
            answer = answer + tmp;
        }
        
        return answer;
    }
}
