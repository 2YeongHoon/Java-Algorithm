import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        int budgetCount = 0;
        Arrays.sort(d);
        for (int idx : d){
            if ( count + idx <= budget){
                count += idx;
                budgetCount++;
            }
            else
            {
                break;
            }
        }
        return budgetCount;
    }
}