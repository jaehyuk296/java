
import java.util.Scanner;

public class Test {

	public Test(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요\n");
		System.out.print("철수 >> ");
		String player1 = scanner.next();
		System.out.print("영희 >> ");
		String player2 = scanner.next();
		
		String result = start(player1,player2);
		System.out.print(result);
	}
	
	private String start(String a, String b) {
		if(a.equals(b)) {
			return "비겼으";
		}else if(a.equals("가위")&&b.equals("보")||a.equals("바위")&&b.equals("가위")||a.equals("보")&&b.equals("바위")) {
			return "철수 이김";
		}else {
			return "영희 이김";
		}
	}
	
	public static void main(String[] args) {
		new Test();
	}

}
