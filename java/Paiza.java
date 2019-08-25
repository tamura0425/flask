import java.util.*;

public class Paiza {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		
        int loop = sc.nextInt();
        sc.nextLine();//行おくり
		for(int i = 0; i  <= loop ; i++){
			String str = sc.nextLine();
			System.out.println(str.trim());
		}
		
	}
}




