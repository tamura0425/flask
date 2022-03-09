import java.util.ArrayList;
import java.util.Scanner;

public class Map {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> intList = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		String string = sc.nextLine();
        disp(string );

	}
	public static void disp(String string) {
		
		if (string.charAt(0) <= string.charAt(string.length() - 1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
            
        }

	}
}

