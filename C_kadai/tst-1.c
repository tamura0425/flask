/*課題:カレンダー */
/*任意の年月のカレンダーを表示する。
　　年と月を入力すると、その月のカレンダーを出力するような
　　プログラムを作成によ。*/

#include<time.h>
#include<stdio.h>
#include<stdlib.h>

typedef struct{
int year,month,day;
} date_type;

int days(date_type *d){
    int Y,M,D;
    Y=d->year; /*「構造体ポインタ->「メンバ名」*/
    M=d->month;
    D=d->day;
    
    if(M==1||M==2){
        M+=12;Y--;
    }
return (365*(Y-1926)+(Y/4)-(Y/100)+(Y/400)+(int)(30.6*(M+1))+D-525);
}


/*ある月のカレンダーを表示する。*/
/*その月の1日の曜日(日->0,・・・,土->6を求める*/
int first_day_of_month(date_type *d){
    date_type temp=*d;
    temp.day=1;
    return(days(&temp)%7);
}

/*その月の日数を求める*/
/*days(翌月の1日)-days(その月の1日)*/


int days_in_month(date_type *d){
    date_type temp1,temp2;
    temp1=temp2=*d;
    temp1.day=temp2.day=1;
    temp1.month++;
    return days(&temp1)-days(&temp2);
}

/*カレンダーを表示する*/
/*土曜日を書いたら改行する*/

int main(int argc,char *argv[]){
date_type birthday,*today;
int day_of_week,w,i,n;
char *youbi[]={"  日","  月","  火","  水","  木","  金","  土"};

if(argc !=3){
    fprintf(stderr,"usage>birth Y M \n");
    exit(1); /*強制終了　終了コード=1*/
}
birthday.year=atoi(argv[1]);
birthday.month=atoi(argv[2]);

w=first_day_of_month(&birthday);
n=days_in_month(&birthday);
for(i=0;i<7;i++){
    printf("%3s",youbi[i]);    
}


printf("\n%*s",w*3,"");

for(i=1;i<=n;i++){
    printf("%3d",i);
    
    if(++w%7==0){
        printf("\n");    
    }

}

for(w=1;w<42;w+=7){
    printf("\n");    
}

return 0;
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
