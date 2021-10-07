package paiza;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
public class Paiza1 {
		static Scanner sc = new Scanner(System.in);
		static ArrayList<String> intList = new ArrayList<String>();
		static ArrayList<String> intList2 = new ArrayList<String>();

		public static void main(String[] args) {
			LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();

			hashmap.put("Kyoko", "B");
			hashmap.put("Rio", "O");
			hashmap.put("Tsubame", "AB");
			hashmap.put("KurodaSensei", "A");
			hashmap.put("NekoSensei", "A");

	        for(String loop : hashmap.keySet()){
	        	String disp = hashmap.get(loop);
	        	System.out.println(loop + " " + disp);
	        }

		}

	}



