class Solution {
    public int solution(int[] nums) 
    {
        int answer = 0;
        int num;
        
        for(int i = 0; i < nums.length - 2; i++)
        {            
            for(int j = i+1; j < nums.length -1; j++)
            {
                for(int k = j+1; k < nums.length; k++)
                {
                    num = primeNum(nums[i] + nums[j] + nums[k]);
                    answer = answer + num;       
                }
            }
        }

        return answer;
    }
    
    public int primeNum(int num)
    {
        int tmp = 0;
        for(int l = 2; l < num+1; l++)
        {
            if(num % l == 0 && l != num) 
            {
                break;
            }
            else if(l == num) 
            {
                tmp++;
            }
        }  
            
        return tmp;
    }
}
