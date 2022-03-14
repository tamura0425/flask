# 必要なライブラリのインポート
from flask import *
from flask import Flask
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

@ok_module.route("/1")
def a1():
    name = "私は田村弘忠です。"
    return render_template("index.html", name_value = name)

@ok_module.route("/2")
def a2():
   #変数定義
    return render_template("right.html")

@ok_module.route("/3")
def sake_type():
       #変数定義
     return render_template("Sake_type.html")

# @ok_module.route("/05")
# def sake_type():
#        #変数定義
#      return render_template("Sake_type.html")
#script.js

@ok_module.route("/js")
def sake_type():
       #変数定義
     return render_template("test.html")




@ok_module.route('/bootstrap')
def bootstrap():
    return render_template('bootstrap.html')
