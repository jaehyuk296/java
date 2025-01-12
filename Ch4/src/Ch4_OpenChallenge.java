import java.util.Scanner;

public class Ch4_OpenChallenge {
    Scanner scanner = new Scanner(System.in);
    int people; // 게임 참가자 수
    String currentWord = "아버지"; // 시작 단어

    public class Player {
        String name;

        // 사용자로부터 단어 입력받기
        String getWordFromUser() {
            return scanner.next();
        }
    }

    public Ch4_OpenChallenge() {
        run();
    }

    // 끝말잇기 성공 여부 확인
    boolean checkSuccess(String previousWord, String newWord) {
        if (newWord == null || newWord.isEmpty()) {
            return false; // 단어가 비어 있으면 실패로 간주
        }
        char lastChar = previousWord.charAt(previousWord.length() - 1); // 이전 단어의 마지막 글자
        char firstChar = newWord.charAt(0); // 새로운 단어의 첫 글자
        return lastChar == firstChar;
    }

    // 게임 실행 메서드
    public void run() {
        System.out.println("끝말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇 명입니까? >> ");
        people = scanner.nextInt();
        scanner.nextLine(); // 버퍼 정리

        Player[] players = new Player[people];

        // 플레이어 이름 입력
        for (int i = 0; i < people; i++) {
            players[i] = new Player();
            System.out.print("참가자의 이름을 입력하세요 >> ");
            players[i].name = scanner.nextLine();
        }

        System.out.println("시작하는 단어는 \"" + currentWord + "\"입니다.");

        // 게임 진행
        while (true) {
            for (int i = 0; i < people; i++) {
                System.out.print(players[i].name + " >> ");
                String newWord = players[i].getWordFromUser();

                // 끝말잇기 성공 여부 확인
                if (!checkSuccess(currentWord, newWord)) {
                    System.out.println(players[i].name + "이 졌습니다.");
                    System.out.println("게임 종료");
                    return; // 게임 종료
                }

                // 단어 갱신
                currentWord = newWord;
            }
        }
    }

    public static void main(String[] args) {
        new Ch4_OpenChallenge();
    }
}
