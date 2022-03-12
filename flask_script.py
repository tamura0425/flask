# 必要なライブラリのインポート
from flask import *
from flask import Flask

#分割ファイルをメインで使用する為に記載
#記載例　from Pythonファイルメイ import モジュール名
from ok import ok_module
from ng import ng_module

import pymysql

# render_templateを使用するために記載
from flask import Flask, render_template #追加
#flask_bootstrapの使用
from flask_bootstrap import Bootstrap



#データベースをSQLAlchemyで操作するために必要
from sqlalchemy import create_engine, Column, String, Integer
from sqlalchemy.ext.declarative import declarative_base
from sqlalchemy.orm import sessionmaker



# アプリの設定 ・Flaskオブジェクトの生成
app = Flask(__name__)
bootstrap = Bootstrap(app)

##以下をモジュールとして定義しアプリケーションに認識
app.register_blueprint(ok_module)
app.register_blueprint(ng_module)

# どのページで実行する関数か設定
@app.route("/01")
#メイン関数
def main():
    name = "Flask"
    players = ["111","555","777"]
    
    #templateのデータを渡すためにrender_templateの引数として記述[ name_value = name]
    return render_template("index.html",name_value = name,players = players)


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

"""
GET用クエリパラメータの値を取得    request.args.get
POST用クエリパラメータの値を取得   request.form.get

実態は ImmutableMultiDict というオブジェクトとなっている。

このオブジェクトの各種メソッドを使用して、パラメータの取得や、
存在確認や値の型とデフォルト値を指定することができる。以下サンプル

@app.route('/api/books/')
def api_books():
    offset = request.args.get('offset', default=0, type=int)
    limit = request.args.get('limit', default=100, type=int)
"""


# @app.route("/index")
# def index():
#     return render_template("index.html")


@app.route("/1")
def aa5():
    name = "私は田村弘忠です。"
    return render_template("index.html", name_value = name)

@app.route("/2")
def test():
   #変数定義
    return render_template("right.html")


@app.route("/3")
def header():
    #変数定義
    return render_template("header.html")

@app.route("/4")
def hogehoge():
       #変数定義
     return render_template("test.html")

@app.route("/5")
def hogehoge():
       #変数定義
     return "5"

@app.route("/6")
def hogehoge():
       #変数定義
     return "6"

@app.route("/7")
def hogehoge():
       #変数定義
     return "7"

# @app.route("/05")
# def sake_type():
#        #変数定義
#      return render_template("Sake_type.html")


@app.route('/bootstrap')
def bootstrap():
    return render_template('bootstrap.html')


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






if __name__ == "__main__":  # 実行されたら
    app.run(debug=True, host='0.0.0.0', port=8888, threaded=True)
