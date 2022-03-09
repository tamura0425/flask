package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> IntList = new ArrayList<Integer>();
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		

		int count1 = 0;
		int count2 = 0;
		
		String str1= sc.nextLine();
		
		String strArray[] = str1.split("");
		
		ArrayList<String> list = new ArrayList<>(List.of(strArray));
		Set<String> set = new HashSet<>(list);
		
		for(String s :set) {
			count2++;
		}

		if(count2 == 4) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}


	}

}

