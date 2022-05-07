class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        int tmp = 0;
        for ( int i = 0; i < a.length; i++)
        {
            tmp = a[i] * b[i];
            answer = answer + tmp;
            tmp = 0;
        }
        return answer;
    }
}
