#!/usr/bin/env python

import requests
from bs4 import BeautifulSoup
# Webページを取得して解析する

load_url = "https://wa3.i-3-i.info/"
html = requests.get(load_url)
soup = BeautifulSoup(html.content, "html.parser")

# HTML全体を表示する
print(soup)
