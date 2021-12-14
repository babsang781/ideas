package functionTest;

import java.io.IOException;

public class test1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		String result = "";
		IOControll io = new IOControll();
		io.makeFile();
		
		io.Cmd();
		
//		System.out.println(io.Cmd());
//		io.fileDelete();
		//fileDelete(); // 파일 삭제용 메소드
//	      io.makeFile();
//	      result = io.inputCommand("javac Output.java");
//	      System.out.println(result);
//	      result = io.inputCommand("java Output");
//	      System.out.println(result);

//	      // 버퍼를 만들어서 자바 코드 자바파일을 만들어주는 객체
//	      // BufferedOutputStream 입력객체.write(String.getBytes()) 해서 입력
//	      BufferedOutputStream bs = null;
//	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	      
//	      try {
//	         bs = new BufferedOutputStream(new FileOutputStream("C:/Users/otata/Desktop/practice/Output.java"));
//	         String str = "class Output{public static void main(String[] args){";
//	         String str2 = br.readLine();
//	         str +=str2+"}}";
//	         bs.write(str.getBytes());
		//
//	      } catch (Exception e) {
//	         e.getStackTrace();
//	      } finally {
//	         bs.close();
//	      }

	}

}
