# 쌤 방법이 아니라, 처음 내가 생각했던 reshape를 사용하는 방법으로 로직 짜서 만든 것 

# Q. 각 사용자별 평점 평균 구하기 and 리스트에 [사용자, 사용자의 평점 평균] 형태로 저장할 것

# 내 로직 

user_list1=[]
user_list2=[]

for i in range(1, 6041):     # 회원 id 수 만큼 반복 범위 지정
    user_list1.append(i)
    temp = data[ data[:,0] == i ]     # 각 회원마다 영화 평점 배열을 임시변수에 저장
    user_list2.append(np.mean(temp[:,2]))   # id와 평균 평점을 배열형태로 추가
    
user_arr=np.array(user_list1+user_list2)    # list + list 한, 전체 리스트를 np.array 로 생성
user_arr = user_arr.reshape(2,6040)    # reshape를 이용해서 1~6040 까지 id 행과 평점 평균의 행을 생성

#코드 행수가 두 배로 길어지긴 했지만 list와 array 를 구분하고 각 특성을 이해하는 데에는 괜찮은 방법인 것 같다.
