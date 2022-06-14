class Solution {
    public int solution(int[][] sizes) {
        int len = sizes.length;
        int left_max = 0;
        int right_max = 0;
        int answer = 0;
        int tmp = 0;

        for ( int i = 0; i < len; i++ ){
            if ( sizes[i][0] < sizes[i][1] ) {
                tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }

        for ( int[] size : sizes ){
            if ( left_max < size[0] ){
                left_max = size[0];
            }
            if ( right_max < size[1] ){
                right_max = size[1];
            }
        }
        answer = left_max * right_max;
        
        return answer;
    }
}