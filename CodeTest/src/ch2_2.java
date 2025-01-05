import java.util.Scanner;

public class ch2_2 {
	
	public ch2_2(){
		Scanner scanner = new Scanner(System.in);
		String name1,name2;
		
		int late1,late2;
		int noshow1,noshow2;
		int score1 = 100;
		int score2 = 100;
		
		
		System.out.println("학생1>>");
		name1=scanner.next();
		late1 = scanner.nextInt();
		noshow1= scanner.nextInt();
		int minus1= late1*3+noshow1*8;
		score1=score1-(minus1);
		
		System.out.println("학생2>>");
		name2 = scanner.next();
		late2 = scanner.nextInt();
		noshow2 = scanner.nextInt();
		int minus2= late2*3+noshow2*8;
		score2 =score2-(minus2);
		
		System.out.println(name1+"의 감점은 "+minus1+", "+ name2+"의 감점은 "+minus2);
		if(minus1>minus2) {
			System.out.println(name2+"의 출석 점수가 더 높음."+name2+ " 출석 점수는 " + score2);
		}else {
			System.out.println(name1+"의 출석 점수가 더 높음."+name1+ " 출석 점수는 " + score1);
		}
	}
	
	public static void main(String[] args) {
        new ch2_2();
    }
}
