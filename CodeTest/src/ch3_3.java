import java.util.Scanner;

public class ch3_3 {

    public ch3_3() {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("양의 정수를 입력하시오 >> ");
            num = scanner.nextInt();

            if (num > 0) {
                for (int i = num; i > 0 ; i--) {
                	for(int j=i;j>0;j--)
                		System.out.print("*");
                	System.out.println();
                }
                
                break; // Exit loop after valid input
            } 
        }

    }

    public static void main(String[] args) {
        new ch3_3();
    }
}
