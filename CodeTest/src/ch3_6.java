import java.util.Scanner;

public class ch3_6 {

    public ch3_6() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.print("양의 정수 10개 입력 >> ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("자리수의 합이 9인 것은 ...");

        for (int i = 0; i < array.length; i++) {
            int sum = 0; // 자리수 합 초기화
            int num = array[i];

            // 자리수 합 계산
            while (num > 0) {
                sum += num % 10; // 마지막 자리수 더하기
                num /= 10;       // 마지막 자리수 제거
            }

            // 자리수의 합이 9인 경우 출력
            if (sum == 9) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println(); // 줄 바꿈
        scanner.close(); // Scanner 닫기
    }

    public static void main(String[] args) {
        new ch3_6();
    }
}
