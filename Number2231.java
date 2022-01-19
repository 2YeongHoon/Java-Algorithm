import java.util.Scanner;
 
public class Number2231 {
	public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
		int n = input .nextInt();
		int result = 0;
 
		for(int idx = 0; idx < n; idx++) {
			int number = idx;
			int sum = 0;	
			
			while(number != 0) {
				sum += number % 10;	
				number /= 10;
			}
			
			if(sum + idx == n) {
				result = idx ;
				break;
			}
		}
		System.out.println(result);
	}
}