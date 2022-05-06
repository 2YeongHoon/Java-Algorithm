class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        return LottoCheck(lottos, win_nums);
    }
    
    public int[] LottoCheck(int[] lottos, int[] win_nums){
        int zeroCount = 0;
        int lottoCount = 0;
        int[] lottoResult = new int[2];
        
        for (int i = 0; i < 6; i++){
            if (lottos[i] == 0){
                zeroCount++;
                continue;
            }
            for (int j = 0; j < 6; j++){
                if ( lottos[i] == win_nums[j] ){
                    lottoCount++;
                    continue;
                }
            }
        }


        if ((7 - (lottoCount + zeroCount)) >= 6){
            lottoResult[0] = 6;            
        }else{
            lottoResult[0] = (7 - (lottoCount + zeroCount));             
        }
        if (7-(lottoCount) >= 6){
            lottoResult[1] = 6;
        }else{
            lottoResult[1] = 7 - lottoCount;
        }
        
        return lottoResult;
    }
}
