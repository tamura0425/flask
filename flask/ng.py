<<<<<<< HEAD
=======
# 必要なライブラリのインポート
from flask import *
from flask import Flask
>>>>>>> c59828f18874d9f15882b51a04f89706843e5d8c
from flask import Blueprint

ng_module = Blueprint("ng", __name__)

@ng_module.route("/ng")
def get_ng():
    return "NG"