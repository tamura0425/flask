package paiza;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Paiza {
static Scanner sc = new Scanner(System.in);
static ArrayList<Integer> intList = new ArrayList<Integer>();
static ArrayList<String> strList = new ArrayList<String>();

	public static void main(String[] args) {

		String a = sc.next();

		int num = Integer.parseInt(a);
		int s=2;

		int ans=1;
		int flag=0;
		for(int i=1; i<=100;i++ ) {
			ans=s*ans;
			if(num==ans) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}
	}
}

