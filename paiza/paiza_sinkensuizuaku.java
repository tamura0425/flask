import java.util.*;

public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        // H と W と N を受け取る
        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();

        // トランプの並び方を表す t を受け取る
        int[][] t = new int[H][W];
        for (int h = 0; h < H; h++) {
            for (int w = 0; w < W; w++) {
                t[h][w] = sc.nextInt();
            }
        }

        // 時系列の長さ L を受け取る
        int L = sc.nextInt();

        // ゲームの手順の記録を受け取る
        int[] a = new int[L];
        int[] b = new int[L];
        int[] A = new int[L];
        int[] B = new int[L];

        for (int l = 0; l < L; l++) {
            a[l] = sc.nextInt();
            b[l] = sc.nextInt();
            A[l] = sc.nextInt();
            B[l] = sc.nextInt();
        }

        // 手番を持つプレーヤーを表す変数
        int player = 1;

        // 各プレーヤーが取り除いたトランプの枚数
        int[] count = new int[N];

        for (int l = 0; l < L; l++) {
            int firstCard = t[a[l] - 1][b[l] - 1];
            int secondCard = t[A[l] - 1][B[l] - 1];

            if (firstCard == secondCard) {
                count[player - 1] += 2;
            } else {
                player += 1;

                if (player == N + 1) {
                    player = 1;
                }
            }
        }

        for (int n = 0; n < N; n++) {
            System.out.println(count[n]);
        }
    }
}
