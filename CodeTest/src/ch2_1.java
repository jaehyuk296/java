
import java.util.Scanner;

public class ch2_1 {

    public ch2_1() {
        Scanner scanner = new Scanner(System.in);
        int age;
        int red = 10;
        int blue = 5;
        int yellow = 1;

        System.out.print("나이를 입력하세요>>");
        age = scanner.nextInt();

        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요.");
        } else {
            int redCount = age / red;
            age %= red; // age = age % red

            int blueCount = age / blue;
            age %= blue; // age = age % blue

            int yellowCount = age / yellow; // yellow = 1이므로 나머지 모두 yellow에 포함

            int sum = redCount+blueCount+yellowCount;
            System.out.println("빨간 초 " + redCount + "개, " + "파란 초 " + blueCount + "개, " + "노란 초 " + yellowCount + "개. 총 "+sum+"개가 필요합니다.");
        }

        scanner.close();
    }

    public static void main(String[] args) {
        new ch2_1();
    }
}
