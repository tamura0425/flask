# 必要なライブラリのインポート
from flask import *

# render_templateを使用するために記載
from flask import Flask, render_template #追加
#flask_bootstrapの使用
from flask_bootstrap import Bootstrap

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


@app.route('/')
def hello_world():
    return render_template('bootstrap.html')








if __name__ == "__main__":  # 実行されたら
    app.run(debug=True, host='0.0.0.0', port=8888, threaded=True)
