package paiza;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;


	public class Piaza {
			static Scanner sc = new Scanner(System.in);
			static ArrayList<String> strList = new ArrayList<String>();
			static ArrayList<String> intList2 = new ArrayList<String>();

			public static void main(String[] args) {
				LinkedHashMap<String, String> hashmap = new LinkedHashMap<String, String>();
				//名前入力
				String str = sc.next();
				//ループ回数入力
				int num = sc.nextInt();
				//改行　※この一文（処理を）記載しないとエラーが起きいる
				sc.nextLine();

				for(int i = 0; i < num; i++ ) {
					String strArray[] = sc.nextLine().split(" ");
					String strKey = strArray[0];
					String strValue = strArray[1];
					hashmap.put(strKey,strValue);

				}

				System.out.println(str + " "+hashmap.get(str));
	}

}
