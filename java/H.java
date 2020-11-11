import java.util.*;
public class H{public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("hiro");
    System.out.println("タムラ");

    int output1 = sc.nextInt();

    int output2 = sc.nextInt();
    System.out.println(ans(output1,output2));
    int outputAns = ans(output1,output2);
    System.out.println(outputAns); 
   
    ans1(output1,output2);
  
  }
  
  public static int ans(int a,int b){
    int back = a * b;
    return back;
  }
public static void ans1(int a , int b){
   System.out.println(a+b);
}



}

