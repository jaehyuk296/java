import java.util.Scanner;

interface IStack {
    int capacity();
    int length();
    boolean push(String val);
    String pop();
}

class StringStack implements IStack {
    private int size;
    private int top = 0;
    private String[] array;

    public StringStack(int size) {
        this.size = size;
        array = new String[size];
    }

    @Override
    public int capacity() {
        return size;
    }

    @Override
    public int length() {
        return top;
    }

    @Override
    public boolean push(String val) {
        if (top >= size) {
            return false; // 스택이 꽉 찼을 경우 false 반환
        }
        array[top] = val;
        top++;
        return true;
    }

    @Override
    public String pop() {
        if (top <= 0) {
            return null; // 스택이 비었을 경우 null 반환
        }
        top--;
        return array[top];
    }
}

public class Ch5_11 {

    public static void main(String[] args) {
        System.out.print("스택 용량>>");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        StringStack stringStack = new StringStack(size);

        while (true) {
            System.out.print("문자열 입력>>");
            String val = scanner.next();

            if (val.equals("그만")) {
                break; // 입력 종료
            }

            if (!stringStack.push(val)) { // 스택이 꽉 찬 경우 처리
                System.out.println("스택이 꽉 차서 " + val + " 저장 불가");
            }
        }

        System.out.print("스택에 저장된 문자열 팝 : ");
        String poppedValue;
        while ((poppedValue = stringStack.pop()) != null) { // 스택이 빌 때까지 팝
            System.out.print(poppedValue + " ");
        }

        scanner.close(); // 스캐너 닫기
    }
}

