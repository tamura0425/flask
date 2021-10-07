import java.util.*;


public class Main {
 	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();

	public static void main(String[] args) {

		int a = sc.nextInt();
		int ans = 1;

		for(int i = 1 ;i <= a ;i++) {
			ans = ans * 2;
		}
		System.out.println(ans);

	}
}

