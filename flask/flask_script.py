from flask import *  # 必要なライブラリのインポート

app = Flask(__name__)  # アプリの設定 ・Flaskオブジェクトの生成


@app.route("/")  # どのページで実行する関数か設定
def main():      #メイン関数 
    return "Hello, World!"  # Hello, World! を出力



#@app.route("/<name>")
#def hello_name(name):
#    return "Hello, {}".format(name)




@app.route("/name")
def hello_name():
    return "5555555555"


@app.route("/index")
def index():
    return render_template("index.html")







if __name__ == "__main__":  # 実行されたら
    app.run(debug=True, host='0.0.0.0', port=8888, threaded=True)
