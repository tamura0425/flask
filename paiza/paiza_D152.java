import java.util.*;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> IntList = new ArrayList<Integer>();
	static ArrayList<String> StrList = new ArrayList<String>();

	public static void main(String[] args) {
		LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();
		//名前入力
		String str1 = sc.nextLine();
		int num = sc.nextInt();

		char someChar = 'R';
		int count = 0;

		for (int i = 0; i < str1.length(); i++) {
		    if (str1.charAt(i) == someChar) {
		        count++;
		    }
		}
		if(count >= num) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
