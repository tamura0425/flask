<<<<<<< HEAD
=======
# 必要なライブラリのインポート
from flask import *
from flask import Flask
>>>>>>> c59828f18874d9f15882b51a04f89706843e5d8c
# render_templateを使用するために記載
from flask import Flask, render_template #追加
from flask import Blueprint

ok_module = Blueprint("ok", __name__)

@ok_module.route("/ok")
def get_ok():
    return "OK"


@ok_module.route("/index")
def index():
    return render_template("index.html")

@ok_module.route("/05")
def sake_type():
       #変数定義
     return render_template("Sake_type.html")