# requests 와 BeautifulSoup 임포트
import requests as req
from bs4 import BeautifulSoup as bs

# 내 깃허브 홈 화면 접근
url = 'https://github.com/babsang781/'
res = req.get(url)

# soup 변수에 화면 소스코드 담고, 그 중에 잔디밭 소스코드 뽑음.
soup = bs(res.text, 'lxml')
soup.select('svg.js-calendar-graph-svg')




# 하지만 실패... jsp로 웹 출력했을 때, 전부 단일한 검정색으로 출력되어서 contribution의 수와, 색깔 확인이 안 됨.
# 아마도 css 설정과, contribution 값이 다른 소스에 있어서 그런 것 같음. 그것도 찾아서 같이 가져와야 할 듯
