package study;

import java.util.ArrayList;
import java.util.Scanner;

public class Study {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();

	public static void main(String[] args) {

		String str = sc.nextLine();

		int a = 0;
		int b = 0;

		a = str.indexOf("x",0);

		b = str.indexOf("+");

		String strArray[] = str.split("");

		if(b >= 1) {
			switch (a){
			  case 8:
				    int num1 = Integer.parseInt(strArray[0]);
				    int num2 = Integer.parseInt(strArray[4]);
				    int ans1 = num1 + num2;

				    System.out.println(ans1);
				    break;
			  case 4:
				  	int num3 = Integer.parseInt(strArray[0]);
				    int num4 = Integer.parseInt(strArray[8]);
				    int ans2 = num4 - num3;

				    System.out.println(ans2);
				    break;
			  case 0:
				  	int num5 = Integer.parseInt(strArray[4]);
				    int num6 = Integer.parseInt(strArray[8]);
				    int ans3 = num6 - num5;

				    System.out.println(ans3);
			}

		}
		else {
			switch (a){
			case 8:
			    int num1 = Integer.parseInt(strArray[0]);
			    int num2 = Integer.parseInt(strArray[4]);
			    int ans1 = num1 + num2;

			    System.out.println(ans1);
			    break;
		  case 4:
			  	int num3 = Integer.parseInt(strArray[0]);
			    int num4 = Integer.parseInt(strArray[8]);
			    int ans2 = num3 - num4;

			    System.out.println(ans2);
			    break;
		  case 0:
			  	int num5 = Integer.parseInt(strArray[4]);
			    int num6 = Integer.parseInt(strArray[8]);
			    int ans3 = num6 + num5;

			    System.out.println(ans3);
			}
		}
	}
}

