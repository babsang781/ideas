package functionTest;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOControll {

	private StringBuffer buffer;
	private Process process;
	private BufferedReader bufferedReader;
	private StringBuffer readBuffer;

	public void makeFile() throws IOException {

		// 버퍼를 만들어서 자바 코드 자바파일을 만들어주는 객체
		// BufferedOutputStream 입력객체.write(String.getBytes()) 해서 입력
		BufferedOutputStream bs = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str2 = " ";
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:/Users/smhrd/Output.java"));
			String str = "class Output{public static void main(String[] args){";
			System.out.println("정답 코드를 입력하세요");
			while (str2 != "") {
				System.out.print(">>");
				str2 = br.readLine();
				str += str2;
			}
			str += "}}";
			bs.write(str.getBytes());

		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			bs.close();
		}
	}

	public void fileDelete() {
		File file = new File("C:/Users/smhrd/Output.java");
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("파일삭제 성공");
			} else {
				System.out.println("파일삭제 실패");
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
//		출처: https://javacpro.tistory.com/27 [버물리의 IT공부]
		file = new File("C:/Users/smhrd/Output.class");

		if (file.exists()) {
			if (file.delete()) {
				System.out.println("파일삭제 성공");
			} else {
				System.out.println("파일삭제 실패");
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}
		
		file = new File("C:/Users/smhrd/write.txt");
		
		if (file.exists()) {
			if (file.delete()) {
				System.out.println("파일삭제 성공");
			} else {
				System.out.println("파일삭제 실패");
			}
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}

	public void Cmd() throws IOException, InterruptedException {

		String[] cmd = { "cmd", "javac", "Output.java", "java", "Output" };

//		Process proc = rt.exec(commands);
		Process process = new ProcessBuilder(cmd).start();

		BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));

		BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));

		// Read the output from the command
		System.out.println("Here is the standard output of the command:\n");
		String s = null;
		int count = 0;
		while (count < 100) {
			s = stdInput.readLine();
			System.out.println(s);
			count++;
		}

		// Read any errors from the attempted command
		System.out.println("Here is the standard error of the command (if any):\n");
		while ((s = stdError.readLine()) != null) {
			System.out.println(s);
		}
//			System.out.println("7차시도");
	}

//	public void Cmd() throws IOException {
//		String[] cmd = new String[] { "cmd", "javac", "Output.java", "java", "Output" };
//		// 출처: https://yangyag.tistory.com/55 [Hello Brother!]
//		String str = null;
//		
//		Process process = new ProcessBuilder(cmd).start();
//		
//		BufferedReader stdOut = new BufferedReader(new InputStreamReader(process.getInputStream()));
//
//		while ((str = stdOut.readLine()) != null) {
//			System.out.println(str);
//		}
//
//		
//	}

	// public String inputCommand(String cmd) {
//	         StringBuffer buffer = new StringBuffer(); // StringBuffer 객체 선언
	//
////	         buffer.append("cmd.exe /c " + cmd); // String 형태 버퍼 변수에 String을 추가함
//	         buffer.append("cmd.exe /c "); // String 형태 버퍼 변수에 String을 추가함
//	         buffer.append(cmd);
	//
//	      return buffer.toString();
	// }
	//
	// public String exeCommand(String cmd) {
	//
//	      try {
//	         process = Runtime.getRuntime().exec(cmd);
//	         bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
	//
//	         String line = null;
//	         readBuffer = new StringBuffer();
	//
//	         while ((line = bufferedReader.readLine()) != null) {
//	            readBuffer.append(line);
//	            readBuffer.append("\n");
//	         }
	//
//	      } catch (Exception e) {
//	         e.printStackTrace();
//	         System.exit(1);
//	      }
	//
//	      return null;
	// }

}
