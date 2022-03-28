# 必要なライブラリのインポート
from flask import *
from flask import Flask
# render_templateを使用するために記載
from flask import Flask, render_template #追加
from flask import Blueprint

sake_module = Blueprint("sake", __name__)


# @sake_module.route("/sake")
# def sake1():
#   return "sake"



@sake_module.route("/sake/1")
def sake2():
  return render_template('/sake/sake.html')

@sake_module.route('/sake/')
def sake3():
  return render_template('templates/sake/sake.html')