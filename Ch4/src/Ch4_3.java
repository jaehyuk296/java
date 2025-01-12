import java.util.Scanner;

class Grade{
	String name;
	int java,web,os;
	
	public Grade(String name,int java,int web,int os) {
		this.name=name;
		this.java=java;
		this.web=web;
		this.os=os;
	}
	
	String getName() {
		return name;
	}
	
	int getAverage() {
		int aver=0;
		aver=(java+web+os)/3;
		return aver;
	}
}

public class Ch4_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름, 자바, 웹프로그래밍, 운영체제 순으로 점수 입력>>");
		String name = scanner.next();
		int java=scanner.nextInt();
		int web=scanner.nextInt();
		int os=scanner.nextInt();
		
		Grade st =new Grade(name,java,web,os);
		System.out.print(st.getName()+"의 평균은 "+st.getAverage());
		scanner.close();
	}

}
