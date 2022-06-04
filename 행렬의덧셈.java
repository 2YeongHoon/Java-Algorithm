<<<<<<< HEAD
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int size = arr1.length;
        int size1 = arr1[0].length;
        int[][] answer = new int[size][size1];
          
        for ( int i = 0; i < size; i++ ){
            for ( int j = 0; j < size1; j++ ){
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
=======

>>>>>>> a609df819b15f029ab5ec1c5d4bbd8f9ace5a550
