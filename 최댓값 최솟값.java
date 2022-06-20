import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<String> items = Arrays.asList(s.split(" "));
        List<Integer> stream = items.stream()
                .map(t->Integer.parseInt(t))
                .collect(Collectors.toList());

        answer += Collections.min(stream).toString()
                + " "
                + Collections.max(stream).toString();
        
        
        
        return answer;
    }
}