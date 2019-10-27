
import static java.util.function.Function.*;
import static java.util.stream.Collectors.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Integer> arrayInt = new ArrayList<Integer>();
	static ArrayList<String> arraystr = new ArrayList<String>();
	public static void main(String[] args) throws Exception{

		 Map<String, Long> map = Arrays.asList("HND", "NRT", "KIX", "NGO", "NGO", "NGO", "NGO", "NGO")
                 .stream()
                 .collect(groupingBy(identity(), counting()));


		 for(Long val : map.values()){
			 if(val > 1) {
				 System.out.println(val);
			 }
			    //System.out.println(val);
			}



	}
}
                   
