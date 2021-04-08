from django.shortcuts import render
from django.http import HttpResponse

def index(request):
    context = {
        'message': 'Welcome my BBS',
        'players': ['勇者', '戦士', '魔法使い', '忍者']
    }
    return render(request, 'bbs/index.html', context)
