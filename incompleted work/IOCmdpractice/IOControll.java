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

		// ���۸� ���� �ڹ� �ڵ� �ڹ������� ������ִ� ��ü
		// BufferedOutputStream �Է°�ü.write(String.getBytes()) �ؼ� �Է�
		BufferedOutputStream bs = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str2 = " ";
		try {
			bs = new BufferedOutputStream(new FileOutputStream("C:/Users/smhrd/Output.java"));
			String str = "class Output{public static void main(String[] args){";
			System.out.println("���� �ڵ带 �Է��ϼ���");
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
				System.out.println("���ϻ��� ����");
			} else {
				System.out.println("���ϻ��� ����");
			}
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}

		File file2 = new File("C:/Users/smhrd/Output.class");
		if (file2.exists()) {
			if (file2.delete()) {
				System.out.println("���ϻ��� ����");
			} else {
				System.out.println("���ϻ��� ����");
			}
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
//		��ó: https://javacpro.tistory.com/27 [�������� IT����]
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
//			System.out.println("7���õ�");
	}

//	public void Cmd() throws IOException {
//		String[] cmd = new String[] { "cmd", "javac", "Output.java", "java", "Output" };
//		// ��ó: https://yangyag.tistory.com/55 [Hello Brother!]
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
//	         StringBuffer buffer = new StringBuffer(); // StringBuffer ��ü ����
	//
////	         buffer.append("cmd.exe /c " + cmd); // String ���� ���� ������ String�� �߰���
//	         buffer.append("cmd.exe /c "); // String ���� ���� ������ String�� �߰���
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
