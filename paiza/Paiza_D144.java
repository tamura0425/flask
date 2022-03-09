package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
static ArrayList<String> strList = new ArrayList<String>();
static ArrayList<String> intList2 = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String str[] = sc.nextLine().split("");
		int num1 = Integer.parseInt(str[4]);
		int num2 = Integer.parseInt(str[3]);
		int num3 = Integer.parseInt(str[2]);
		int num4 = Integer.parseInt(str[1]);
		int num5 = Integer.parseInt(str[0]);

		int ans1 = 0;
		int ans2 = 0;
		int ans3 = 0;
		int ans4 = 0;
		int ans5 = 0;

		if(ans1 ==0 ) {
			ans1 = 1;
		}
		else{
			ans1 = 2;
		}
		ans2 = num2 * 2;
		ans3 = num3 * 2 * 2;
		ans4 = num4 * 2 * 2 * 2;
		ans5 = num5 * 2 * 2 * 2 * 2;


		int ans = ans1 + ans2 + ans3 + ans4 + ans5;
		System.out.println(ans);

	}

}

