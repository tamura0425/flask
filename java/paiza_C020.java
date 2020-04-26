package study;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class AA {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> IntList = new ArrayList<Integer>();
	static ArrayList<String> StrList = new ArrayList<String>();

	public static void main(String[] args) {
		LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();
		//名前入力
		String str = sc.nextLine();

		String strArray[] = str.split(" ");

		int num0 = Integer.parseInt(strArray[0]);

		int num1 = Integer.parseInt(strArray[1]);
		int num2 = Integer.parseInt(strArray[2]);


		double a = 100 - num1;
		double b = 100 - num2;

		double x = a * 0.01;
		double y = b * 0.01;


		double ans0 = num0 * x;
		
		
		double ans1 = y * ans0;
		
		System.out.println(ans1);

	}
}

