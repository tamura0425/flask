package test;
import java.util.ArrayList;
import java.util.Scanner;
public class Paiza {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>intArray = new ArrayList<Integer>();
		
		String src = sc.nextLine();
		StringBuffer sb = new StringBuffer(src);
		String dst = sb.reverse().toString();
		System.out.println(""+dst);
		
	    sc.close();
	}

}

