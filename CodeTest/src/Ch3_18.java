import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch3_18 {

	public Ch3_18() {
		System.out.println("10명 학생의 학번과 점수 입력");
		int [] score = new int [10];
		int [] id = new int [10];
		Scanner scanner = new Scanner(System.in);
		int player=0;
		boolean cont=false;
		int [] record = new int [10];
		int j=0;
		
		for(int i=0;i<10;i++) {
			System.out.print(i+1+">>");
			id[i]=scanner.nextInt();
			score[i]=scanner.nextInt();
		}
		

		System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
		player = scanner.nextInt();
		
		while(player!=3) {
			cont=false;
		try {
			if(player==1) {
				System.out.print("학번>>");
				int stu_id = scanner.nextInt();
				for(int i=0;i<10;i++) {
					if(id[i]==stu_id) {
						System.out.println(score[i]+"점");
						cont = true;
					}
				}
				if(cont==false)
					System.out.println(stu_id+"의 학생은 없습니다.");

				
				System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
				player = scanner.nextInt();
			}
			
			else if(player==2) {
				System.out.print("점수>>");
				int stu_score = scanner.nextInt();
				for(int i=0;i<10;i++) {
					if(score[i]==stu_score) {
						record[j++]=i+1;
						cont = true;
					}
				}
				
				if(cont==true) {
				System.out.print("점수가 "+stu_score+"인 학생은 ");
				for(int h=0;h<10;h++) {
					if(record[h]==0)
						break;
					else {
						System.out.print(record[h] +" ");
					}
				}
				System.out.println("입니다");
				}
				
				if(cont==false)
					System.out.println("점수가 "+stu_score+"인 학생은 없습니다.");
				
				System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
				player = scanner.nextInt();
			}
			
			else if(player==3) {
				System.out.print("프로그램을 종료합니다.");
				break;
			}
			
			else {
				System.out.println("다시 입력하세요");
				System.out.print("학번으로 검색: 1, 점수로 검색: 2, 끝내려면 3>>");
				player = scanner.nextInt();
			}
		}catch(InputMismatchException e){
			String ex=scanner.nextLine();
			System.out.println("경고!! 정수를 입력하세요.");
			continue;
		}
	}		
}
	
	public static void main(String[] args) {
		new Ch3_18();

	}
}
