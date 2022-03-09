import java.util.*;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> IntList = new ArrayList<Integer>();
    static ArrayList<String> StrList = new ArrayList<String>();
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String str = sc.nextLine();
        int num = Integer.parseInt(str);

        int SET1 = 0;
        int SET2 = 0;
        int a = 0;

        for(int i = 0; i < num; i++) {
                String input = sc.nextLine();

                if(input.contains("SET 1")) {
                        String strArray[] = input.split(" ");
                        SET1 = Integer.parseInt(strArray[2]);

                }
                else if(input.contains("SET 2")) {
                        String strArray[] = input.split(" ");

                        SET2 = Integer.parseInt(strArray[2]);
                }
                else if(input.contains("ADD")) {
                        String strArray[] = input.split(" ");
                        a= Integer.parseInt(strArray[1]);
                        SET2 = SET1  + a;
                }
                else {
                        String strArray[] = input.split(" ");
                        a= Integer.parseInt(strArray[1]);
                        SET2 = SET1 - a;
                }
        }
        System.out.print(SET1 + " ");
        System.out.println(SET2);
    }

}
