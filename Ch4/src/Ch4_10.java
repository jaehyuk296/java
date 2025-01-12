import java.util.Scanner;

class DayDiary {
    String text = "***"; // 초기값 설정
}

class MonthDiary {
    DayDiary[] month = new DayDiary[30];
    Scanner scanner = new Scanner(System.in);

    public MonthDiary(int year, int month) {
        System.out.println("***** " + year + "년 " + month + "월 다이어리 *****");

        // `DayDiary` 객체 초기화
        for (int i = 0; i < this.month.length; i++) {
            this.month[i] = new DayDiary();
        }

        while (true) {
            System.out.print("기록:1, 보기:2, 종료:3>> ");
            int choose = scanner.nextInt();

            if (choose == 1) {
                write();
            } else if (choose == 2) {
                show();
            } else if (choose == 3) {
                System.out.println("다이어리를 종료합니다.");
                break;
            } else {
                System.out.println("1, 2, 3 중에서 다시 입력하세요.");
            }
        }
    }

    void write() {
        System.out.print("날짜(1~30)와 텍스트(빈칸 없이 4글자 이하)>> ");
        int date = scanner.nextInt();
        String text = scanner.next();

        // 날짜 유효성 검사
        if (date < 1 || date > 30) {
            System.out.println("잘못된 날짜입니다. 다시 입력하세요.");
            return;
        }

        if (text.length() > 4) {
            System.out.println("텍스트는 4글자 이하로 입력하세요.");
            return;
        }

        // 다이어리 내용 저장
        month[date - 1].text = text;
        System.out.println(date + "일에 기록되었습니다.");
    }

    void show() {
        for (int i = 0; i < month.length; i++) {
            System.out.print(month[i].text + "\t");
            if ((i + 1) % 7 == 0) { // 7일마다 줄바꿈
                System.out.println();
            }
        }
        System.out.println();
    }
}

public class Ch4_10 {
    public static void main(String[] args) {
        MonthDiary monthDiary = new MonthDiary(2024, 10);
    }
}
