package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	public static void main(String[] args) {
		int ans = 0;

		String cho="chocolate";

		String str = sc.nextLine();
		int n = sc.nextInt();

		if(str.equals(cho)) {
			ans = n * 2;
		}
		else {
			ans = n * 5;
		}
			System.out.println(ans);
	}
}
