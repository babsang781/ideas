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
		//fileDelete(); // ���� ������ �޼ҵ�
//	      io.makeFile();
//	      result = io.inputCommand("javac Output.java");
//	      System.out.println(result);
//	      result = io.inputCommand("java Output");
//	      System.out.println(result);

//	      // ���۸� ���� �ڹ� �ڵ� �ڹ������� ������ִ� ��ü
//	      // BufferedOutputStream �Է°�ü.write(String.getBytes()) �ؼ� �Է�
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
