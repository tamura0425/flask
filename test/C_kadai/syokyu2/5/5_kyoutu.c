/*
 5 [共通課題] 重複検出-qsort: 文字列対象

【氏名】      田村　寛忠
【学籍番号】  201IR077P
【作成日】    2021年8月8日

【仕様／目的】
    ・n個の文字列からなるデータの列が与えられたとき、
    　それら全てを読み取って2度以上現れる（重複して現れる）文字列の有無を調べる。
    
【入力】
    ・コマンドライン入力から正整数 n（ 0 ＜ n ≦ 1250000 ）が与えられる。
    ・データの列は、つぎの2つの関数を使って得る。
        void setup(int n);  // 長さ n のデータ列を設定する
        char *getStr();     // setup で設定されたデータの列から
                            //次の文字列を1つ取り出して返してくる
                            // データの列が尽きているなら NULL を返してくる
    ・データの列として並ぶ文字列は、その長さが40文字を超えることはない。

【出力】
    ・2度以上現れる文字列が存在しなければ、何も出力しないで実行を終了する。
    ・2度以上現れる文字列が存在していれば、現れた回数が最も大きな文字列の出現回数 m を求め、
    　かつ、その出現回数をもつ文字列が何種類存在したかを、
    　つぎの形の１行として標準出力に書き出す。
        m(k)・・・m 出現回数の最大値
                　k その最大回数出現した文字列の種類数
    ・二つの数値 m、k は必要最小限の桁数で書き出す

【構成／アルゴリズム】
    ・長さ n のデータ列を設定する
    ・全ての文字列をarrStrに取得
    ・文字列配列arrStrのソート
    ・配列を順番にサーチして出現回数の最大値と出現回数の算出
        ・同じ文字列が続けば、出現回数をカウントアップ
        ・異なる文字列が現れたの場合は、出現回数と最大値を比較
        　・出現回数が大きい場合は最大値を更新、出現回数を初期化
        　・出現回数が大きい場合は、出現回数をカウントアップ

    　・次のサーチのために、配列中の文字列の位置を更新する

【機能保障】
    ・メモリはcallocで確保して、freeで解放
    ・取得した文字列を配列に格納し、順番にソートすることで比較を可能とする
    ・全ての文字列を１番目から、配列数－１まで順番にサーチすることで全ての文字列を検査

【関数】
     int comp_str(const void *a, const void *b)
     説明   ：文字列を比較し同じ内容であれば、0を返し不一致であれば、0以外を返す。
     引数   ：ポインタ型の定数a,b
     戻り値 ：int型


【const】
    　constとは、変数の値を変更せず定数として宣言する際に使う修飾子です。
    　constが付くと変数は書き換えができなくなり、読み取り専用となります。
    　値を変更しようとするとコンパイルエラーが発生します。
    　const修飾子は変数の型の前に記述します。
    　また、const修飾子はポインタ変数に対しても使用します。
    　ポインタ変数とは変数のアドレスを記憶する変数のことです。
【strcmp】
    　2つの文字列を比較する関数
    　strcmpは2つの文字列を引数として取ります。 
    　二つの文字列が同じ内容であれば、strcmpは0を返します。
    　2つの文字列が異なる場合、strcmpは0以外の値を返します。
*/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "oracle.h"

// 文字列比較
int comp_str(const void *a, const void *b){
    return(strcmp(*(char**)a, *(char**)b));
}

//-----------------------------------------------------------------------------
//　main関数
//-----------------------------------------------------------------------------
int main(int argc, char *argv[]){

    int i,j;        // ループ用変数
    int n;          // 入力値
    char** arrStr;  // 文字列配列
    int m;          // 出現回数の最大値
    int same_cnt;   // 出現回数加算用ワーク
    int k;          // その最大回数出現した文字列の種類数
    
    //---------------------------------
    // init
    //---------------------------------
    // input & check
    if (argc != 2) {
        printf("input errorr argc!=2:%d\n",argc);
        exit(-1);
    }
    n = atoi(argv[1]);
    if ( !(n > 0 && n <= 1250000 ) ) {
        printf("input errorr n:%d\n",n);
        exit(-1);
    }

    //---------------------------------
    // main
    //---------------------------------
    // 長さ n のデータ列を設定
    setup(n);
    
    // 全ての文字列を取得
    arrStr = calloc(sizeof(char *),n);
    for(i=0;(arrStr[i]=getStr())!= NULL;i++) ;

    // 文字列配列のソート
    qsort(arrStr,n,sizeof(char *),comp_str);

    // 文字列検査
    m=k=same_cnt=1;     // 
    for(i=0; i!=n-2;i++) {
        j=i+1;
        while(1){

            //　同じ文字列が続く場合
            if ( strcmp(arrStr[i],arrStr[j]) == 0 ) {
                same_cnt++;
                j++;
                // 配列の最後の場合ループ終了
                if (j>n-1) break;
            //　異なる文字列が現れた場合
            } else {
                //　最大値の更新
                if (m<same_cnt){
                    m=same_cnt;
                    k=1;
                } 
                //　出現回数のカウントアップ
                if (m==same_cnt){
                    k++;
                }
                same_cnt=1;     //出現回数の初期化
                i=(j-1);        //文字列配列のサーチ位置を更新
                break;
            }
        }
    }

    //---------------------------------
    // term
    //---------------------------------
    free(arrStr);

    // ２回以上出現回数がある場合に出力
    if (m!=1) printf("%d(%d)\n",m,k-1);

    return 0;
}
