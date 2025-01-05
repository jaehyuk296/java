import java.util.Scanner;

public class CardGame {

    public CardGame() {
        int card; // 랜덤으로 생성된 숫자
        int player; // 플레이어가 입력한 숫자
        int attempt = 1; // 시도 횟수
        String resume; // 다시 시작 여부

        System.out.println("수를 결정하였습니다. 맞추어 보세요\n0-99");
        card = (int) (Math.random() * 100); // 0 ~ 99 사이의 정수

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(attempt + ">> ");
            attempt++;

            // 사용자 입력 받기
            player = scanner.nextInt();

            if (player == card) {
                System.out.println("맞았습니다.\n다시 하시겠습니까(y/n)>>");
                resume = scanner.next();

                if (resume.equals("n")) {
                    break; // 게임 종료
                } else if (resume.equals("y")) {
                    System.out.println("수를 결정하였습니다. 맞추어 보세요\n0-99");
                    card = (int) (Math.random() * 100); // 새 숫자 생성
                    attempt = 1; // 시도 횟수 초기화
                } else {
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                }
            } else if (player < card) {
                System.out.println("더 높게");
            } else {
                System.out.println("더 낮게");
            }
        }

        scanner.close(); // 스캐너 닫기
        System.out.println("게임이 종료되었습니다.");
    }

    public static void main(String[] args) {
        new CardGame();
    }
}
