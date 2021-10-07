import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> intArray = new ArrayList<Integer>();
	static ArrayList<String> strArray = new ArrayList<String>();
	public static void main(String[] args) {


		int a = sc.nextInt();
		sc.nextLine();
		
		String str = sc.nextLine();

		String[] strList = str.split("");


		for(String s : strList) {
			System.out.println(s);
		}



//		//String a = sc.nextLine();
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//
//		int x = a/b;
//
//		System.out.println(x);


	}

}

