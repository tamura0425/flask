import java.util.*;

public class Paiza {
    public static void main(String[] args) throws Exception {
        // Your code here!
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int output = sc.nextInt();

		for(int i = 0; i < output; i++){
			a = sc.nextInt();
			b += a;
		}
		System.out.println(b);
	}
}
