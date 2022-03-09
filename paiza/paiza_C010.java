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

		int num = sc.nextInt();
		for(int i = 0 ; i < num; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			int ans0 = x - num0;
			int ans1 = y - num1;

			int ans2 = ans0 + ans1;
			if(ans2 > num2) {
				System.out.println("silent");
			}
			else {
				System.out.println("noisy");
			}
		}


	}
}

