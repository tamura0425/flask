package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
public class Study {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> strList = new ArrayList<String>();
	static ArrayList<String> strList2 = new ArrayList<String>();
	static ArrayList<Integer> intList = new ArrayList<Integer>();
	static HashMap<String,Integer> Hmap = new HashMap<String,Integer>();

	public static void main(String[] args) {


		//List<String> list = Arrays.asList("a", "a", "b");
		//strList.add()
		String strArray[] = sc.nextLine().split(" ");

		for(String a : strArray) {
			strList.add(a);
		}


		Map<Object, Long> map =
			    strList.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

			for (Entry<Object, Long> entry : map.entrySet()) {
			    System.out.println(entry.getKey() + " " + entry.getValue());
			}



	}
}

