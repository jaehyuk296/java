import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch3_17 {

	public Ch3_17() {
		String []coffee = {"핫아메리카노", "아이스아메리카노", "카푸치노", "라떼"};
		int [] price = {3000,3500,4000,5000};
		Scanner scanner = new Scanner(System.in);
		String order;
		int num;
		boolean check = false;
		
		while(true) {
		check = false;
		System.out.println("핫아메리카노, 아이스아메리카노, 카푸치노, 라떼 있습니다.");
		System.out.print("주문>>");
		order = scanner.next();
		
		if(order.equals("그만"))
			break;
		
		try {
			num = scanner.nextInt();
		}catch(InputMismatchException e) {
			scanner.nextLine();
			
			System.out.println("잔 수는 양의 정수로 입력해주세요!.");
			continue;
		}
		
		for(int i=0;i<coffee.length;i++) {
			if(coffee[i].equals(order)) {
				System.out.println("가격은 " + price[i]*num + "원입니다.");
				check = true;
				break;
			}
		}	
		
		if(check == false) {
			System.out.println(order + "은 없는 메뉴입니다.");
		}
	}
	}
	
	public static void main(String[] args) {
		new Ch3_17();
	}
}
