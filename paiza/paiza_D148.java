package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	public static void main(String[] args) {


		String str = sc.nextLine();
		String strArray[] = str.split(" ");

		int num = sc.nextInt();

		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);

		int ans = 0;



		if(a > num) {
			ans = (a + b) / 2;
			System.out.println(ans);
		}
		else {
			System.out.println(a);
		}


	}
}
