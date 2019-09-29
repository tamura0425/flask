import java.util.*;
public class H{public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("hiro");

    int output1 = sc.nextInt();

    int output2 = sc.nextInt();
    int outputAns = ans(output1,output2);
    System.out.println(outputAns);
  }
  public static int ans(int a,int b){
    int back = a * b;
    return back;
  }
}

