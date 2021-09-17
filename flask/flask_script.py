from flask import *  # 必要なライブラリのインポート

# render_templateを使用するために記載
from flask import Flask, render_template #追加

app = Flask(__name__)  # アプリの設定 ・Flaskオブジェクトの生成


@app.route("/")  # どのページで実行する関数か設定
def main():      #メイン関数 
    name = "Flask"
    players = ["111","555","777"]
    return render_template("index.html",name_value = name,players = players)


@app.route("/3")  # どのページで実行する関数か設定
def hello_world11():      #メイン関数 

    return "Hello, World!"  # Hello, World! を出力



@app.route("/<name>")
def hello_name(name):
    return "Hello, {}".format(name)




#@app.route("/name")
#$def hello_name():
#    return "5555555555"


@app.route("/index")
def index():
    return render_template("index.html")


@app.route("/555")
def aa5():
    name = "私は田村弘忠です。"
    return render_template("index.html", name_value = name)


@app.route("/666")
def hello_world226():
   #変数定義
#templateのデータを渡すためにrender_templateの引数として記述[ name_value = name]
    return render_template("index2.html",)



@app.route("/111")
def hello_world():
   #変数定義
    name = "Flask"
#templateのデータを渡すためにrender_templateの引数として記述[ name_value = name]
    return render_template("index.html", name_value = name)



@app.route("/333")
def konniti():
   #変数定義
    return "こんにちは"

@app.route("/222")
def test():
   #変数定義
    return render_template("right1.html")


@app.route("/444")
def header():
   #変数定義
    return render_template("header.html")




if __name__ == "__main__":  # 実行されたら
    app.run(debug=True, host='0.0.0.0', port=8888, threaded=True)
