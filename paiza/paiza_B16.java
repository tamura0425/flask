package paiza;

import java.util.Scanner;

public class Paiza {

	    public static void main(String[] args) {
	        // 自分の得意な言語で
	        // Let's チャレンジ！！
		
		//標準出力
	        Scanner sc = new Scanner(System.in);
	        String line = sc.nextLine();

	        String[] input = line.split(" ");
	        int w = Integer.parseInt(input[0]);
	        int h = Integer.parseInt(input[1]);
	        int n = Integer.parseInt(input[2]);

	        String line2 = sc.nextLine();
	        String[] input2 = line2.split(" ");

	        int x = Integer.parseInt(input2[0]) + 1;
	        int y = Integer.parseInt(input2[1]) + 1;

	        for(int i=0; i<n; i++){
	            String line3 = sc.nextLine();
	            String[] idou = line3.split(" ");
	            
	            int e = Integer.parseInt(idou[1]);
	            
	            if(idou[0].equals("U")){
	                y = (y + e) % h;
	            }else if(idou[0].equals("D")){
	                y =  y + (h -(e % h));
	            }else if(idou[0].equals("R")){
	                x = (x + e) % w;
	            }else{
	                x =  x + (w - (e % w));
	            }
	            x %= w;
	            y %= h;
	        }

	        System.out.println((x-1) + " " + (y-1));
	    }
	}
