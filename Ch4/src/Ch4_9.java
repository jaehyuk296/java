import java.util.Scanner;

class Player {
    int people;
    Scanner scanner = new Scanner(System.in);

    public Player() {
        System.out.print("*** 예측 게임을 시작합니다. ***\n게임에 참여할 선수 수>> ");
        people = scanner.nextInt();
        String[] name = new String[people];
        int[] score = new int[people];

        // 선수 이름 입력
        for (int i = 0; i < people; i++) {
            System.out.print("선수 이름>> ");
            name[i] = scanner.next();
        }

        while (true) {
            System.out.println("1~100 사이의 숫자가 결정되었습니다. 선수들은 맞추어 보세요.");
            int targetNumber = (int) (Math.random() * 100) + 1;
            int[] guesses = new int[people];
            int[] differences = new int[people];

            // 선수들 숫자 입력
            for (int i = 0; i < people; i++) {
                System.out.print(name[i] + ">> ");
                guesses[i] = scanner.nextInt();
                differences[i] = Math.abs(guesses[i] - targetNumber); // 절댓값 저장
            }

            // 이번 라운드 승자 찾기
            int minDifference = differences[0];
            int winnerIndex = 0;
            for (int i = 1; i < people; i++) {
                if (differences[i] < minDifference) {
                    minDifference = differences[i];
                    winnerIndex = i;
                }
            }

            // 점수 업데이트
            System.out.println("정답은 " + targetNumber + "입니다. " + name[winnerIndex] + "이 이겼습니다. 승점 1점 확보!");
            score[winnerIndex]++;

            // 계속할지 여부 확인
            System.out.println("계속하려면 'yes' 입력, 종료하려면 'no' 입력>> ");
            String resume = scanner.next();

            if (resume.equalsIgnoreCase("no")) {
                // 최종 승자 결정
                int maxScore = score[0];
                int overallWinnerIndex = 0;

                for (int i = 1; i < people; i++) {
                    if (score[i] > maxScore) {
                        maxScore = score[i];
                        overallWinnerIndex = i;
                    }
                }

                // 최종 결과 출력
                System.out.println("최종 점수:");
                for (int i = 0; i < people; i++) {
                    System.out.println(name[i] + ": " + score[i] + "점");
                }
                System.out.println(name[overallWinnerIndex] + "이 최종 승리하였습니다!");
                break;
            } else if (!resume.equalsIgnoreCase("yes")) {
                System.out.println("잘못된 입력입니다. 게임을 종료합니다.");
                break;
            }
        }

        scanner.close(); // Scanner 닫기
    }
}

public class Ch4_9 {
    public static void main(String[] args) {
        new Player();
    }
}
