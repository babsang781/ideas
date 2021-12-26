<h1>Java console 게임 exe 파일에 음악 넣고 재생시키기...</h1>
<br/>
1차 시도: 콘솔됨 : music./ 파일 : exe 파일 안 됨<br/>
2차 시도: 콘솔됨 : ./music./ 파일 : exe 파일 안 됨<br/>
<Strong>3차 시도: 콘솔됨 : /music./ 파일 : exe 파일 됨(C:\music에 음악이 있는 조건)</Strong><br/>
----<br/>
[ C:\music 폴더 비우고 다시 테스트 ]<br/>
1차 시도: music 폴더 위치 패키지: ../music./파일 :콘솔 안 됨<br/>
2차 시도: music 폴더 위치 src 같은 위치: ../music./파일 :콘솔 안 됨<br/>
3차 시도: music 폴더 위치 src 같은 위치: ../../music./파일 :콘솔 안 됨<br/>
4차 시도: music 폴더 위치 src 같은 위치: /music./파일 :콘솔 안 됨<br/>
5차 시도: music 폴더 위치 src 같은 위치: music./파일 :콘솔 됨 : exe 안 됨<br/>
6차 시도: music 폴더 위치 src 같은 위치: ./music./파일 :콘솔 됨 : exe 안 됨.<br/>
--- <br/>
7차 시도: music 폴더 위치 src 같은 위치 <strong>리소스 파일 설정:</strong>  ./music/파일 :콘솔 됨 : exe 안 됨<br/>
8차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정: ../../music/파일 :콘솔 안됨 : exe 안 됨<br/>
9차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정: /music/파일 :콘솔 안됨 : exe 안 됨<br/>
10차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정: music/파일 :콘솔 됨: exe 안 됨<br/>
11차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정: ../music/파일 :콘솔 안됨: exe 안 됨<br/>
12차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정: ././music/파일 :콘솔 됨: exe 안 됨<br/><br/>

<strong>[ 윈도우가 인식하는 경로 \\ 써야 함. +exe 만들 때 리소스 상대경로 설정 재시도 ] </strong><br/>
13차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정/exe 파일시 custom 경로 설정: \\music/파일 :콘솔 안 됨: exe 안 됨<br/>
14차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정/exe 파일시 custom 경로 설정: ./music/파일 :콘솔 됨: exe 안 됨<br/>
15차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정/exe 파일시 custom 경로 설정: /music/파일 :콘솔 안 됨: exe 안 됨<br/>
16차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정/exe 파일시 custom 경로 설정: \\music\\파일 :콘솔 안 됨: exe 안 됨<br/>
17차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정/exe 파일시 custom 경로 설정: .\\music\\파일 :콘솔 됨: exe 안 됨<br/>
18차 시도: music 폴더 위치 src 같은 위치 리소스 파일 설정/exe 파일시 custoㄴm 경로 설정: ...\\..\\music\\파일 :콘솔 됨: exe 안 됨<br/>
<br/>          ..\\..\\music\\파일 :콘솔 안 됨: exe 안 됨
<br/>          .\\..\\..\\music\\파일 :콘솔 안 됨: exe 안 됨
<br/>지긍까지는 전부 실패... 현재 도움 요청해놓음... 
