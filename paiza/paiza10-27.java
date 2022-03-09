package tore;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> arrayInt = new ArrayList<Integer>();
	static ArrayList<String> arraystr = new ArrayList<String>();
	public static void main(String[] args) throws Exception{

		String[] strArray = {"HND", "NRT", "KIX", "NGO", "NGO"};
		arraystr.add("HND");
		arraystr.add("NRT");
		arraystr.add("KIX");
		arraystr.add("NGO");
		arraystr.add("NGO");

		System.out.println("false");
		Boolean result = false;
		for(String s :strArray) {
			for(String g : arraystr) {
				if(s.equals(g)) {
					result = false;
					break;
				}
			}
			if(result) {
				break;
			}
		}
		
	}

}

