class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PositivePoint extends Point {

    public PositivePoint(int x, int y) {
        super(x > 0 ? x : 1, y > 0 ? y : 1);
        }

    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")의 점";
    }

    public void move(int x, int y) {
        if (x > 0 && y > 0) {
            super.move(x, y); // 양수일 때만 좌표 이동
        }
    }
}

public class Ch5_6 {

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint(10, 10);
        p.move(5, 5);
        System.out.println(p.toString() + "입니다.");

        p.move(2, -2);
        System.out.println(p.toString() + "입니다.");

        // 음수 좌표로 초기화 시도
        PositivePoint q = new PositivePoint(-10, -10);
        System.out.println(q.toString() + "입니다.");
    }
}
