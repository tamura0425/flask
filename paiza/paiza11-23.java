package paiza;
import java.util.ArrayList;
import java.util.Scanner;
public class Paiza1 {

		static Scanner sc = new Scanner(System.in);
		static ArrayList<String> intList = new ArrayList<String>();

		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ

			String str1 = sc.nextLine();
			char[] a = str1.toCharArray();
	 		int times1 = Character.getNumericValue(a[0]);

	 		String str2 = sc.nextLine();
			char[] b = str2.toCharArray();
	 		int times2 = Character.getNumericValue(b[0]);

	 		String str3 = sc.nextLine();
			char[] c = str3.toCharArray();
	 		int times3 = Character.getNumericValue(c[0]);


	 		System.out.println(times1);
	 		System.out.println(times2);
	 		System.out.println(times3);

	 		if(times3 >= times1 && times3 <=times2) {
	 			System.out.println("true");
	 		}
	 		else {
	 			System.out.println("false");
	 		}



		}

	}

以下でも可
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        char y = sc.next().charAt(0);
        char c = sc.next().charAt(0);
        System.out.println(x <= c && c <= y);
    }
}

