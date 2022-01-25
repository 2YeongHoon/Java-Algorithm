import java.util.Scanner;

// DFS, 백트레킹
public class Number15649{
    public static int[] arr;
	public static boolean[] visitCheck;
 
	public static void main(String[] args) {
 
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
 
		arr = new int[m];
		visitCheck = new boolean[n];
		dfs(n, m, 0);
	}
 
	public static void dfs(int n, int m, int depth) {
		if (depth == m) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
 
		for (int i = 0; i < n; i++) {
			if (!visitCheck[i]) {
				visitCheck[i] = true;
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);
				visitCheck[i] = false;
			}
		}
	}

}