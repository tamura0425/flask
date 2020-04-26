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

		int ans0 = 0;
		int ans1 = 0;
		int ans2 = 0;


		if(num0 >= num1 && num0 >= num2) {
			ans0 = 2;
		}
		else if(num0 <= num1 && num0 >= num2) {
				ans0 =1 ;
		}
		else if(num0 >= num1 && num0 <= num2) {
			ans0 =1 ;
		}
		else {
			ans0 = 0;
		}


		if(num1 >= num0 && num1 >= num2) {
			ans1 = 2;
		}
		else if(num1 <= num0 && num1 >= num2) {
				ans1 =1 ;
		}
		else if(num1 >= num0 && num1 <= num2) {
			ans1 =1 ;
		}
		else {
			ans1 = 0;
		}


		if(num2 >= num0 && num2 >= num1) {
			ans2 = 2;
		}
		else if(num2 <= num0 && num2 >= num1) {
				ans2 =1 ;
		}
		else if(num2 >= num0 && num2 <= num1) {
			ans2 =1 ;
		}
		else {
			ans2 = 1;
		}
		if(ans0 == 1) {
			System.out.println(num0);
		}
		else if(ans1 == 1) {
			System.out.println(num1);
		}
		else if(ans2 == 1) {
			System.out.println(num2);
		}
	}
}

