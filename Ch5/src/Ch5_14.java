import java.util.Scanner;

abstract class Shape {
    private Shape next;
    public Shape() {
        next = null;
    }

    public void setNext(Shape obj) {
        next = obj;
    }

    public Shape getNext() {
        return next;
    }

    public abstract void draw();
}

class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class GraphicEditor {
    private Shape[] shapes;
    private int shapeCount;
    private Scanner scanner;

    public GraphicEditor() {
        shapes = new Shape[100]; // 최대 100개의 도형 저장 가능
        shapeCount = 0;
        scanner = new Scanner(System.in);
        System.out.println("그래픽 에디터 Beauty Graphic Editor를 실행합니다.");
        startEditor();
    }

    private void startEditor() {
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    insertShape();
                    break;
                case 2:
                    deleteShape();
                    break;
                case 3:
                    viewAllShapes();
                    break;
                case 4:
                    System.out.println("Beauty Graphic Editor를 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private void insertShape() {
        if (shapeCount >= shapes.length) {
            System.out.println("더 이상 도형을 삽입할 수 없습니다.");
            return;
        }

        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int shapeType = scanner.nextInt();
        Shape newShape = null;

        switch (shapeType) {
            case 1:
                newShape = new Line();
                break;
            case 2:
                newShape = new Rect();
                break;
            case 3:
                newShape = new Circle();
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                return;
        }

        shapes[shapeCount++] = newShape;
        System.out.println("도형이 삽입되었습니다.");
    }

    private void deleteShape() {
        if (shapeCount == 0) {
            System.out.println("삭제할 도형이 없습니다.");
            return;
        }

        System.out.print("삭제할 도형의 위치>>");
        int index = scanner.nextInt();

        if (index < 1 || index > shapeCount) {
            System.out.println("잘못된 위치입니다.");
            return;
        }

        for (int i = index - 1; i < shapeCount - 1; i++) {
            shapes[i] = shapes[i + 1];
        }
        shapes[--shapeCount] = null;
        System.out.println("도형이 삭제되었습니다.");
    }

    private void viewAllShapes() {
        if (shapeCount == 0) {
            System.out.println("저장된 도형이 없습니다.");
            return;
        }

        for (int i = 0; i < shapeCount; i++) {
            shapes[i].draw();
        }
    }
}

public class Ch5_14 {
    public static void main(String[] args) {
        new GraphicEditor();
    }
}
