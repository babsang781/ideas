public static void main(String[] args) {
		// 그림 출력하기
		question();

//		System.out.println();
//		printKey();
//		System.out.println();
//		payDoc();
//		System.out.println();
//		rentDoc();

	}

public static void printKey() {
		System.out.println();
		System.out.println("========================================== ");
		System.out.println("===============증거를 발견했다!============== ");
		System.out.println("========================================== ");
		System.out.println("                                          ");
		System.out.println("      .@@@.                                ");
		System.out.println("     @@   @@                               ");
		System.out.println("    @       @@@@@@@@@@@@@@@@@@@@@@@        ");
		System.out.println("   |@       @          @@   @@   @@        ");
		System.out.println("     @@   @@           @@   @@   @@        ");
		System.out.println("      *@@@*                                ");
		System.out.println("                                           ");
		System.out.println("========================================== ");
		System.out.println("===============열쇠를 발견했다!============== ");
		System.out.println("========================================== ");
		System.out.println();
	}

	public static void rentDoc() {
		System.out.println();
		System.out.println("========================================== ");
		System.out.println("===============증거를 발견했다!============== ");
		System.out.println("========================================== ");
		System.out.println("            ______________                  ");
		System.out.println("            \\            \\                ");
		System.out.println("             |  차 용 증   |                 ");
		System.out.println("            /            /                 ");
		System.out.println("           |     1 억    |                 ");
		System.out.println("            \\            \\                 ");
		System.out.println("             \\  장현도빌림, \\               ");
		System.out.println("             |  pbk 빌려줌  |                 ");
		System.out.println("             /            /                 ");
		System.out.println("            /____________/                 ");
		System.out.println("                                           ");
		System.out.println("========================================== ");
		System.out.println("===============차용증을 발견했다!============== ");
		System.out.println("========================================== ");

	}

	public static void payDoc() {

		System.out.println("===============증거를 발견했다!============== ");
		System.out.println("========================================== ");
		System.out.println("            ______________                  ");
		System.out.println("            \\             \\                ");
		System.out.println("             |  급여명세서  |                 ");
		System.out.println("           ./             /                 ");
		System.out.println("           /  박나영:1천  /                 ");
		System.out.println("          /             /                 ");
		System.out.println("          |.  pbk:500   |                 ");
		System.out.println("           \\  김지은:400 \\                 ");
		System.out.println("            \\  서하라:400 \\                 ");
		System.out.println("             \\            \\                 ");
		System.out.println("              |  장현도:170 |                 ");
		System.out.println("             /             /                 ");
		System.out.println("            |             |                 ");
		System.out.println("             \\____________\\                 ");
		System.out.println("                                           ");
		System.out.println("                                           ");
		System.out.println("========================================== ");
		System.out.println("===============차용증을 발견했다!============== ");
		System.out.println("========================================== ");
		System.out.println();

	}

	public static void slowPrint(String message, long millisPerChar) {
		for (int i = 0; i < message.length(); i++) {
			System.out.print(message.charAt(i));

			try {
				Thread.sleep(millisPerChar);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static boolean question() {
		Scanner sc = new Scanner(System.in);
		String answer = "";
		int fail = 0;
		int win = 0;

		while (fail < 3 || win > 0) {
			System.out.println("공포의! '+' 찍기!! 코드치기!!! '}'까지 총 6줄 작성하기!!");
			System.out.println("+++++");
			System.out.println("++++");
			System.out.println("+++");
			System.out.println("++");
			System.out.println("+");
			System.out.println();
			System.out.println("단, 1: 이중 for문을 사용하고 // 2: 숫자는 0 부터 5 까지, 0 부터 4까지,");
			System.out.println("//3: '+' 기호를 써서 // 4: 한 줄 씩 출력문을 작성하고 'enter!' \n start!!");

			System.out.println("\n public static void main(String[] args) {");
			for (int i = 1; i <= 6; i++) {
				answer = sc.nextLine();
				String mAnswer = answer.replaceAll(" ", "");

				if (i == 1 && mAnswer.equals("for(inti=0;i<5;i++){")) {
					System.out.println(i + "번째 줄 성공! 다음 줄 ");
				} else if (i == 2 && mAnswer.equals("for(intj=0;j<4;j++){")) {
					System.out.println(i + "번째 줄 성공! 다음 줄 ");

				} else if (i == 3 && mAnswer.equals("System.out.print(\"+\");")) {
					System.out.println(i + "번째 줄 성공! 다음 줄 ");

				} else if (i == 4 && mAnswer.equals("}")) {
					System.out.println(i + "번째 줄 성공! 다음 줄 ");

				} else if (i == 5 && mAnswer.equals("System.out.println();")) {
					System.out.println(i + "번째 줄 성공! 다음 줄 ");

				} else if (i == 6 && mAnswer.equals("}")) {
					System.out.println("    }\n}\n" + i + "번째 줄 성공! 별찍기 성공!! ");
					win++;
				} else {
					fail++;
					System.out.println("실패!" + fail + "회!");
					System.out.printf("\n\n\n");
					System.out.println("다시 푸십시오!");
					break;
				}
			}

		}
		sc.close();
		if(win == 1) {
			System.out.println("증거를 획득하였습니다!");
			return true;
		} else {
			System.out.println("기회를 소진하셨습니다. 종료!!");
			return false;
		}

	}
