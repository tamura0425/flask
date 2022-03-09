package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	public static void main(String[] args) {
		int ans=0;
		int n = sc.nextInt();
			for (int i = 0; i < 4; i++) {
			    int arr = sc.nextInt();
				intList.add(arr);
				int v = intList.get(i);
				int min = intList.get(0);
			    if (v < min) {
			        min = v;
			    }
			    ans = min * n;
			}
			System.out.println(ans);
		}
	}
