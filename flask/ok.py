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