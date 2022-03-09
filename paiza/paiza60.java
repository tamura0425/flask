
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Map {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> intList = new ArrayList<Integer>();

	public static void main(String[] args) {
		int times = sc.nextInt();

		HashMap<Character,Integer> map = new HashMap<>();

		for(int i = 0; i <times ; i++) {
			char c = sc.next().charAt(0);
			int num = sc.nextInt();

			if(map.containsKey(c)) {
				map.put(c, map.get(c) + num);
			}
			else {
				map.put(c,num);
			}
		}
		ArrayList<Integer>intList2 = new ArrayList<Integer>(map.values());

		//intList = (ArrayList<Integer>) map.values();

		Collections.sort(intList2);
		Collections.reverse(intList2);

		for(int count : intList2) {
			for(Character disp : map.keySet()) {
				if(map.get(disp) == count) {
					System.out.println(disp +""+ count);
				}
			}
		}

	}
}


