import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Map {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<String> intList = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		int[] intArray = new int[num];

		for (int i = 0; i < num; i++) {
			int str1 = sc.nextInt();
			intArray[i] = str1;
		}

		Arrays.sort(intArray);
		for(int disp : intArray) {
			System.out.println(disp);
		}
	}
}
