package study;

import java.util.ArrayList;
import java.util.Scanner;

public class AA {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> IntList = new ArrayList<Integer>();
    static ArrayList<String> StrList = new ArrayList<String>();
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ

    	int  a = sc.nextInt();
    	int  b = sc.nextInt();

    	int point = 0;
    	int input = 0;
    	for(int i= 0;i<b;i++) {
    		int  c = sc.nextInt();
    		input = (c * 10) / 100;
    		point = point +input;

    		if(point >= c) {
    			point = point - c;
    			point = point - input;
    			System.out.print(a + " ");
    			System.out.println(point);
    		}
    		else {
    			a = a - c;
    			System.out.print(a + " ");
    			System.out.println(point);
    		}


    	}

    }
}
