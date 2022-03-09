import java.util.ArrayList;
import java.util.Scanner;
public class Maim {

	public static void main(String[] args) {
		//ArrayList<String> array = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> intList = new ArrayList<Integer>();

		String str = sc.nextLine();
		
		int num = str.indexOf("noaki");
		
		if(1 <= num) {
			String output = str.substring(0, num);
			System.out.println(output);
		}
		else {
			System.out.println(str);
		}
	}
}
