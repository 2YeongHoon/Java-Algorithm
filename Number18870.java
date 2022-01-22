import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
 
public class Number18870 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int idx = input.nextInt();
        int rank = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();	
        StringBuilder sb = new StringBuilder();

		int[] origin = new int[idx];	
        int[] sorted = new int[idx];	
 
		for(int index = 0; index < idx; index++) {
			sorted[index] = origin[index] = input.nextInt();
		}

		Arrays.sort(sorted);

		for(int v : sorted) {
			if(!map.containsKey(v)) {
				map.put(v, rank);
				rank++;		
			}
		}
		
		for(int key : origin) {
			int ranking = map.get(key);	
			sb.append(ranking).append(' ');
		}
		
		System.out.println(sb);
	}
}