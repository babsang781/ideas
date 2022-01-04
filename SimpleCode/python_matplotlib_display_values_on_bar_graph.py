# bar 그래프 각각 값 표시하기
# 각 시도별 교통사고 사상자수

x=['강원', '경기', '경남', '경북', '광주', '대구', '대전', '부산', '서울', '세종', '울산', '인천',
       '전남', '전북', '제주', '충남', '충북']
y=[214, 824, 248, 287,  87, 115,  61, 107, 197,  17,  73,  66, 298, 244,  50, 351, 261]

plt.figure(figsize= (10,5))  # figure(figsize=(가로, 세로)) , 그래프 영역 크기 설정: plt 을 그리기 전에 설정해야함 
plt.bar(x,y)

for i, v in enumerate(x):   # enumerate: list 변수의 인덱스와 값을 각각 (,) 튜플 형태로 반복 반환해주는 함수
  
  plt.text(v, y[i]+10, y[i],       # 좌표 (x축:(인덱스) = v, y축:(값표시 구체적 위치[높이]: 인덱스 값으로 조정) = y[0]..y[1], 표시 = y[0]..y[1])
    fontsize = 11,                 # 부가 설정 정보 조금
    color='k',
    horizontalalignment='center',  # horizontalalignment (left, center, right)
    verticalalignment='bottom')    # verticalalignment (top, center, bottom)

plt.show()

