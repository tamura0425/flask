package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
static Scanner sc = new Scanner(System.in);
static ArrayList<String> strList = new ArrayList<String>();
static ArrayList<Integer> intList = new ArrayList<Integer>();
public static void main(String[] args) {

	int n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String str = sc.next();
			if(n != i) {
				System.out.print(str + " ");
			}
			else {
				System.out.print(str);
			}


		}
	}
}
