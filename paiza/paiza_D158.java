import java.util.*;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();

	public static void main(String[] args) {

		int a = sc.nextInt();
		
		if(a >= 40 && a<=60) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}


	}
}

