import java.util.Scanner;

abstract class Calc {
    String errorMsg;
    int a, b;

    abstract void setValue(int a, int b);
    abstract int calculate();
}

class Add extends Calc {
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a + b;
    }
}

class Sub extends Calc {
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int calculate() {
        if (b != 0) {
            return a / b;
        } else {
            errorMsg = "0으로 나눌 수 없습니다. 프로그램 종료.";
            return 0; // 기본값 반환 (실제 결과와는 무관)
        }
    }
}

public class Ch5_13 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        String calcu;

        while (true) {
            System.out.print("두 정수와 연산자를 입력하시오>> ");
            a = scanner.nextInt();
            b = scanner.nextInt();
            calcu = scanner.next();

            Calc calc;

            switch (calcu) {
                case "+":
                    calc = new Add();
                    break;
                case "-":
                    calc = new Sub();
                    break;
                case "*":
                    calc = new Mul();
                    break;
                case "/":
                    calc = new Div();
                    break;
                default:
                    System.out.println("지원하지 않는 연산자입니다.");
                    continue;
            }

            calc.setValue(a, b);
            System.out.println("계산 결과: " + calc.calculate());
            
            if (calc instanceof Div && b == 0) { // 0으로 나누는 경우 처리
                System.out.println(((Div) calc).errorMsg);
                System.exit(0); // 프로그램 종료
            }

            
        }
    }
}
