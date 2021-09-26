# 必要なライブラリのインポート
from flask import *

import pymysql

# render_templateを使用するために記載
from flask import Flask, render_template #追加
#flask_bootstrapの使用
from flask_bootstrap import Bootstrap

#データベースをSQLAlchemyで修正するために必要
from sqlalchemy import create_engine, Column, String, Integer
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker




#データベースコントロール
# connection = pymysql.connect(
#     host="localhost",
#     db="mydb",
#     user="root",
#     password="",
#     charset="utf8",
#     cursorclass=pymysql.cursors.DictCursor
# )

# sql = "SELECT * FROM players"
# cursor = connection.cursor()
# cursor.execute(sql)
# players = cursor.fetchall()

# cursor.close()
# connection.close()

# for player in players:
#     print(player["name"])



# アプリの設定 ・Flaskオブジェクトの生成
app = Flask(__name__)
bootstrap = Bootstrap(app)

# どのページで実行する関数か設定
@app.route("/01")
#メイン関数
def main():
    name = "Flask"
    players = ["111","555","777"]
    return render_template("index.html",name_value = name,players = players)

# どのページで実行する関数か設定
@app.route("/3")
#メイン関数
def hello_world11():
    # Hello, World! を出力
    return "Hello, World!"

@app.route("/111")
def hello_world():
   #変数定義
    name = "Flask"
#templateのデータを渡すためにrender_templateの引数として記述[ name_value = name]
    return render_template("index.html", name_value = name)



# @app.route("/<name>")
# def hello_name(name):
#     return "Hello, {}".format(name)

@app.route("/")
def show():
    message = "Hello World"
    return render_template("form.html", message = message)

@app.route("/result", methods=["GET", "POST"])
def result():
    message = "This is paiza"
    if request.method == "POST":
        article = request.form["article"]
        name = request.form["name"]
    else:
        article = request.args.get("article")
        name = request.args.get("name")
    return render_template("form.html", message = message, article = article, name = name)




@app.route("/index")
def index():
    return render_template("index.html")


@app.route("/555")
def aa5():
    name = "私は田村弘忠です。"
    return render_template("index.html", name_value = name)

@app.route("/222")
def test():
   #変数定義
    return render_template("right.html")


@app.route("/444")
def header():
    #変数定義
    return render_template("header.html")

@app.route("/04")
def hogehoge():
       #変数定義
     return render_template("test.html")


@app.route("/05")
def sake_type():
       #変数定義
     return render_template("Sake_type.html")


@app.route('/bootstrap')
def bootstrap():
    return render_template('bootstrap.html')








if __name__ == "__main__":  # 実行されたら
    app.run(debug=True, host='0.0.0.0', port=8888, threaded=True)
