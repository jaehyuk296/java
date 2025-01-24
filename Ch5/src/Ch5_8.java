import java.util.Scanner;

// 추상 클래스 Box
abstract class Box {
    protected int size;

    public Box(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public abstract boolean consume();

    public abstract void print();
}

// IngredientBox 클래스
class IngredientBox extends Box {
    private String name;
    private Scanner scanner;

    public IngredientBox(String name, int size) {
        super(size);
        this.name = name;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public boolean consume() {
        if (isEmpty()) {
            System.out.println(name + "가(이) 부족합니다.");
            return false;
        }
        size--; // 하나 소비
        System.out.println(name + "을(를) 사용했습니다. 남은 수량: " + size);
        return true;
    }

    @Override
    public void print() {
        System.out.println(name + "의 현재 수량: " + size);
    }

    public void closeScanner() {
        scanner.close();
    }
}

// 메인 클래스
public class Ch5_8 {

    public static void main(String[] args) {
        System.out.println("***** 청춘 커피 자판기입니다. *****");

        // 커피 재료 초기화
        IngredientBox coffee = new IngredientBox("커피", 5);
        IngredientBox sugar = new IngredientBox("설탕", 5);
        IngredientBox cream = new IngredientBox("크림", 5);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.print("다방커피:1, 설탕 커피:2, 블랙 커피:3, 종료:4 >> ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // 다방커피
                    if (coffee.consume() && sugar.consume() && cream.consume()) {
                        System.out.println("다방커피가 만들어졌습니다!");
                    }
                    break;
                case 2: // 설탕 커피
                    if (coffee.consume() && sugar.consume()) {
                        System.out.println("설탕 커피가 만들어졌습니다!");
                    }
                    break;
                case 3: // 블랙 커피
                    if (coffee.consume()) {
                        System.out.println("블랙 커피가 만들어졌습니다!");
                    }
                    break;
                case 4: // 종료
                    System.out.println("자판기를 종료합니다.");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }

            // 재료 상태 출력
            coffee.print();
            sugar.print();
            cream.print();
        }

        scanner.close();
        coffee.closeScanner();
        sugar.closeScanner();
        cream.closeScanner();
    }
}
