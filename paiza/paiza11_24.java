package paiza;
import java.util.ArrayList;
import java.util.Scanner;
public class Paiza1 {
		static Scanner sc = new Scanner(System.in);
		static ArrayList<String> intList = new ArrayList<String>();
		static ArrayList<String> intList2 = new ArrayList<String>();
		public static void main(String[] args) {
			// TODO

			String str = null;
			for(int i = 0; i < 5; i++) {
				str = sc.nextLine();
				intList.add(str);
			}


			for(int i = 0; i < 5; i++) {
				String a = intList.get(i);
				intList2.add( a.substring(0,1));
			}

			int ok = 0;
			for(int i = 0; i < 5; i++) {
				if(intList2.get(0).equals(intList2.get(i))){
					ok++;
				}
			}

			if(ok >= 5) {
				System.out.println(1);
			}
			else {
				System.out.println("D");
			}

		}

	}
下記でも可
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] board = new String[5][5];
        String result = "D";

        for (int i = 0; i < 5; i++) {
            board[i] = scanner.next().split("");
        } 

        for (int i = 0; i < 5; i++) {
            String line = "";
            for (int j = 0; j < 5; j++) {
                line += board[j][i];
            }

            if (line.equals("OOOOO")) {
                result = "O";
            } else if (line.equals("XXXXX")) {
                result = "X";
            }
        }

        System.out.println(result);
        scanner.close();
    }
}
