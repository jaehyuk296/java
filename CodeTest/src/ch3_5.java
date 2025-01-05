import java.util.Scanner;

public class ch3_5 {

	public ch3_5(){
		int [] array= new int[10];
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.print("양의 정수 10개 입력 >> ");

		
		for(int i=0;i<array.length;i++) {
			num=scanner.nextInt();
			array[i]=num;
		}	
		System.out.println("3의 배수는...");
		
		for(int i=0;i<array.length;i++) {
			if(array[i]%3==0)
				System.out.print(array[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		new ch3_5();
	}

}
