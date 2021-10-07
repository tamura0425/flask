package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	public static void main(String[] args) {


		String str = sc.nextLine();
		String strArray[] = str.split("");

		int n = sc.nextInt() - 1;

		for(int i=0 ;i < str.length();i++) {
			String a =  strArray[i];
			strList.add(a);
		}

		strList.remove(n);
		  for (String str1 : strList) {
		    System.out.print(str1);
		  }
	}
}
