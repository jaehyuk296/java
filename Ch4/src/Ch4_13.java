import java.util.Scanner;

class book{
	Scanner scanner = new Scanner(System.in);
	int doing;
	String name;
	int seat_class;
	String [] S_class = new String [10];
	String [] A_class = new String [10];
	String [] B_class = new String [10];
	
	public book() {
		System.out.println("명품콘서트홀 예약 시스템입니다");
		init_class(S_class);
		init_class(A_class);
		init_class(B_class);
		
		while(true) {
			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			doing = scanner.nextInt();
			
			if(doing==1) {
				booking();
			}else if(doing ==2) {
				show();
			}else if(doing == 3) {
				cancel();
			}else if(doing == 4) {
				break;
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
	}
	
	void init_class(String [] seat) {
		for(int i=0;i<seat.length;i++) {
			seat[i] = "---";
		}
	}
	
	void booking() {
		int seat_num;
		
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		seat_class = scanner.nextInt();
		
		System.out.print("이름>>");
		name = scanner.next();
		System.out.print("번호>>");
		seat_num = scanner.nextInt();
		
		switch(seat_class) {
		case 1:
			S_class[seat_num-1] = name;
			break;
		case 2:
			A_class[seat_num-1] = name;
			break;
		case 3:
			B_class[seat_num-1] = name;
			break;
		default:
			System.out.println("다시 예약해주세요");
			break;
		}
	}
	
	void show() {
		System.out.print("S>> ");
		for(int i=0;i<10;i++) {
			System.out.print(S_class[i]+"  ");
		}
		System.out.print("\nA>> ");
		
		for(int i=0;i<10;i++) {
			System.out.print(A_class[i]+"  ");
		}
		System.out.print("\nB>> ");
		
		for(int i=0;i<10;i++) {
			System.out.print(B_class[i]+"  ");
		}
		System.out.println("\n<<<조회를 완료하였습니다.>>>");
	}
	
	void cancel() {
		String [] copy = new String [10];
		System.out.print("좌석 S(1), A(2), B(3)>>");
		seat_class = scanner.nextInt();
		
		switch(seat_class) {
		case 1:
			System.out.print("S>> ");
			for(int i=0;i<10;i++) {
				System.out.print(S_class[i]+"  ");
				copy[i] = S_class[i];
			}
			break;
		case 2:
			System.out.print("A>> ");
			for(int i=0;i<10;i++) {
				System.out.print(A_class[i]+"  ");
				copy[i] = A_class[i];
			}
			System.out.print("\nB>> ");
			break;
		case 3:
			System.out.print("B>> ");
			for(int i=0;i<10;i++) {
				System.out.print(B_class[i]+"  ");
				copy[i] = B_class[i];
			}
			break;
		default:
			System.out.println("자리 확인 다시 해주세요");
			break;
		}
		System.out.print("\n이름>>");
		name = scanner.next();
		
		int j=0;
		for(String name2:copy) {
			if(name2.equals(name)) {
				copy[j]="---";
			break;
			}
			j++;
		}
		
		switch(seat_class) {
		case 1:
			for(int i=0;i<10;i++) {
				S_class[i] = copy[i];
			}
			break;
		case 2:
			for(int i=0;i<10;i++) {
				A_class[i] = copy[i];
			}
			break;
		case 3:
			for(int i=0;i<10;i++) {
				B_class[i] = copy[i];
			}
			break;
		default:
			System.out.println("자리 확인 다시 해주세요");
			break;
		}
	}
	
}

public class Ch4_13 {

	public static void main(String[] args) {
		book bk = new book();

	}

}
