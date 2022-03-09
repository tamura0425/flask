package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	public static void main(String[] args) {
		int ans = 0;



		int n = sc.nextInt();
		int m = sc.nextInt();

		if(n <= m) {
			ans = m - n;
			System.out.println(ans);
		}
		else {
			System.out.println("Thank you");
		}


	}
}
