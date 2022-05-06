import java.util.Scanner;
 
public class LookingForKimInSeoul {
	public static void main(String[] args) {
        String seoul[] = {"Jane", "Kime"};
        String answer = "";
        int position = 0;

        for (String name : seoul){
            if ( name.equals("Kim") ){
                break;
            }
            position++;
        }
        
        answer = "김서방은 " + position + "에 있다";
        System.out.println(answer);
        // return answer;
    }
}
