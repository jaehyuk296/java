import java.util.Scanner;

public class Ch3_11 {

	public Ch3_11(){
		System.out.println("***** 구구단을 맞추는 퀴즈입니다. *****");
		
		int x,y;
		int wrong =0;
		int mul;
		Scanner scanner = new Scanner(System.in);
		int player;
		
		while(wrong<3) {
			x= (int)(Math.random()*9+1);
			y=(int)(Math.random()*9+1);
			mul = x*y;
			
			System.out.print(x+"*"+y+"=");
			player = scanner.nextInt();
			
			if(mul==player) {
				System.out.println("정답입니다. 잘했습니다.");
			}else {
				wrong++;
				if(wrong ==3) {
					System.out.println("3번 틀렸습니다. 퀴즈를 종료합니다.");
				}else {
					System.out.println(wrong + "번 틀렸습니다. 분발하세요.");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ch3_11();

	}

}
