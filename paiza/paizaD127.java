package test;
import java.util.ArrayList;
import java.util.Scanner;
public class Paiza {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>intArray = new ArrayList<Integer>();
		
		String str = sc.nextLine();
		
		String[]strArray = str.split("");

		String num = strArray[1];
		
		int i = 0;
		int count = 0;
		for(i = 0; i < str.length(); i++) {
			if(strArray[(i)].equals(num)){
				count++;
			}
		}

		if((i-1) == count) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	    sc.close();
	}
}


