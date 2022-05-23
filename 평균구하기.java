class Solution {
    public double solution(int[] arr) {
        int answer = 0;
        
        for ( int tmp : arr ){
            answer += tmp;
        }
        return (double)answer / arr.length;
    }
}