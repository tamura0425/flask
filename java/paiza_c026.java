package study;

import java.util.ArrayList;
import java.util.Scanner;

public class AA {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> IntList = new ArrayList<Integer>();
    static ArrayList<String> StrList = new ArrayList<String>();
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String str = sc.nextLine();
        String strArray[] = str.split(" ");

        int num0 = Integer.parseInt(strArray[0]);
        int num1 = Integer.parseInt(strArray[1]);
        int num2 = Integer.parseInt(strArray[2]);

        int ans1 = num1 + num2;
        int ans2 = num1 - num2;

        int count = 0;
        for(int i = 0; i < num0; i++) {
        	int check1 = sc.nextInt();
        	int check2 = sc.nextInt();

        	if(check1 <= ans1&& check1 >= ans2 && check2 <= ans1&& check2 >= ans2) {
        		count++;
        	}
        }
        if(count >=1) {
        	System.out.print(count);
        }
        else {
        	System.out.print("not found");
        }
    }
}
