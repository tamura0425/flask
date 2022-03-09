# 必要なライブラリのインポート
from flask import *
from flask import Flask
from flask import Blueprint

ng_module = Blueprint("ng", __name__)

@ng_module.route("/ng")
def get_ng():
    return "NG"