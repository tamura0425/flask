//氏名
//田村寛忠

//作成日
//2021/071

//仕様

/*
コマンドラインから日付（年・月・日）が与えられたとき、
その日の曜日を出力するプログラム。

１：　年(1900〜2100)、月(1〜12)、日(1〜31) は、空白で区切られてに並んでいる。
２：　出力する曜日は、略号3文字（Sun、Mon、Tue、Wed、Thu、Fri、Sat)を
　　　左詰にした１行として出力に。
*/

// 標準の入力/出力（Standard Input/Output）を扱うヘッダーファイル
#include <stdio.h> 
//標準ヘッダです。一般ユーティリティに関する型、​マクロ、関数が宣言、定義されています
#include <stdlib.h>
//timer が指す記憶場所に格納します。
//暦時刻は多くの処理系で、グリニッチ標準時（GMT）の1970年 1月 1日の00:00:00 から現在までの経過時間を秒単位で扱います。
#include <time.h>

int main(int argc, char *argv[]){
    //変数定義
    //y　年
    int y;
    //m 月　
    int m;
    //　日
    int d;
    //出力用（曜日）
    int w;
    /*
    コマンドライン引数を変数に代入
    */
    y=atoi(argv[1]);
    m=atoi(argv[2]);
    d=atoi(argv[3]);
    
    /*
    
    */
     if (m < 3) {
         y--;
         m += 12;
     }
     
     /*
     ツェラー(Zeller)の公式‐コンピュータ上のカレンダーの作られ方‐を使用
     　年月日を元にしてその日の曜日を求める公式。
    
    日付の法則性
    ・各月の日数は2月以外決まっている
    ・4で割り切れて100で割り切れない年、あるいは、400で割り切れる年は2月が29日までとなる
    
    ※グレゴリオ暦(現在使われている暦の考え方)を前提として話しています。
    ※ツェラーの公式はユリウス暦でも式を変えることによって使用可能なようです。
     以下参考サイト
     http://www.aoharu-b.com/cgi/sk/2008/03/zeller.html
     */
     
     
 /*


西暦をy、月をm、日をdとしたとき
曜日＝(y＋y／4－y／100＋y／400＋(13×m＋8)／5＋d)mod7
ただし、小数点演算は小数点を切り捨てた整数にする
modは剰余(割り算をした際の余り)を示す
1月及び2月の場合は前年の13月及び14月と考える(たとえば2008年2月は2007年14月と考える)
求められた曜日は0を日曜、1を月曜……6を土曜とする。

という式です。
実際に2008年3月1日から土曜日が求められるか試してみましょう。

(y＋y／4－y／100＋y／400＋(13×m＋8)／5＋d)mod7
＝(2008＋2008／4－2008／100＋2008／400＋(13×3＋8)／5＋1)mod7
＝(2008＋502－20＋5＋47／5＋1)mod7
＝(2008＋502－20＋5＋9＋1)mod7
＝(2505)mod7
＝6

6は土曜日なので、確かに正解が導かれています。

     
*/
     w = (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + d) % 7;
     if (w == 0) {
         printf("Sun\n");
     } else if (w == 1) {
         printf("Mon\n");
     } else if (w == 2) {
         printf("Tue\n");
     } else if (w == 3) {
         printf("Wed\n");
     } else if (w == 4) {
         printf("Thu\n");
     } else if (w == 5) {
         printf("Fri\n");
     } else {
         printf("Sat\n");
     }
     
     return 0;
}

