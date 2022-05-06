
class Solution {
    public String solution(String phone_number) {
        int strLeng = phone_number.length();
        String answer = "";
        if (strLeng == 4){
            return phone_number;
        }
        char[] phoneNumberArray = phone_number.toCharArray();
        for (int i=0; i<strLeng-4;i++){
            answer = answer + '*';
        }       
        answer = answer + phoneNumberArray[strLeng-4]+ phoneNumberArray[strLeng-3]+ phoneNumberArray[strLeng-2]+ phoneNumberArray[strLeng-1];
        
        return answer;
    }
}
