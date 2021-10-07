import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> intArray = new ArrayList<Integer>();
	static ArrayList<String> strArray = new ArrayList<String>();
	public static void main(String[] args) {


		//String a = sc.nextLine();
		String str = sc.nextLine();

		int a =str.length();

		String[] strList1 = str.split(str);


		//真ん中"+" + str +"+"
		for(int i = 0; i<3 ;i++) {

			switch(i){
			  case 0:
					for(int x = 0; x<a+2 ;x++) {

						System.out.print("+");
					}
					System.out.println("");
			    break;
			  case 1:
				System.out.println("+" + str +"+");
			    break;
			  case 2:
					for(int x = 0; x<a+2 ;x++) {

						System.out.print("+");
					}
					System.out.println("");
			}

		}

	}

}

