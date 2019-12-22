package paiza;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Paiza1 {
		static Scanner sc = new Scanner(System.in);
		static ArrayList<Map<String, String>> strList = new ArrayList<Map<String, String>>();
		static LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();

		public static void main(String[] args) {
			int loop = sc.nextInt();
			for(int i=0; i<loop;i++) {
				String key = sc.next();
				String vakye = sc.next();
				hashmap.put(key, vakye);
			}

	        for(String loop1 : hashmap.keySet()){
	        	String disp = hashmap.get(loop1);
	        	System.out.println(loop1 + " " + disp);
	        }

		}
	}
