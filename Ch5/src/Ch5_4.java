class Point {
    private int x, y;

    public Point() {
    	this.x=0;
    	this.y=0;
    }
    
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

class ColorPoint2 extends Point {
    String color;

    public ColorPoint2() {
        super(0, 0);
        color = "white";
    }

    public ColorPoint2(int x, int y) {
        super(x, y);
        color = "black";
    }

    public ColorPoint2(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public void set(int x, int y) {
        move(x, y);
    }

    public void set(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color + "색의 (" + getX() + ", " + getY() + ")의 점";
    }

    public double getDistance(ColorPoint2 cp) {
        int dx = getX() - cp.getX();
        int dy = getY() - cp.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
}

public class Ch5_4 {
    public static void main(String[] args) {
        ColorPoint2 zeroPoint = new ColorPoint2();
        System.out.println(zeroPoint.toString() + "입니다.");

        ColorPoint2 cp = new ColorPoint2(10, 10, "RED");
        cp.set("BlUE");
        cp.set(10, 20);
        System.out.println(cp.toString() + "입니다.");

        ColorPoint2 thresholdPoint = new ColorPoint2(100, 100);
        System.out.println("cp에서 임계점까지의 거리는 " + cp.getDistance(thresholdPoint));
    }
}
