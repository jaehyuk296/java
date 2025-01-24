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

class Point3DColor extends Point{
	int c;
	String Color;
	
	public Point3DColor(int a, int b, int c, String Color) {
		super(a,b);
		this.c=c;
		this.Color=Color;
	}
	
	public int getC() {
        return c;
    }
	
	@Override
	public String toString() {
        return "(" + getX() + ", " + getY() + ", " + getC() +")" + Color + "점";
    }
	
	public void move(Point3DColor q) {
		int a = q.getX();
		int b = q.getY();
		move(a,b);
		this.c= q.getC();
	}
	
	 @Override
	 public boolean equals(Object obj) {
	        if (this == obj) return true; // 동일 객체인지 확인
	        if (obj == null || getClass() != obj.getClass()) return false; // 타입 확인

	        Point3DColor other = (Point3DColor) obj;
	        return getX() == other.getX() && getY() == other.getY() && getC() == other.getC();
	    }
}

public class Ch5_7 {

	public static void main(String[] args) {
		Point3DColor p = new Point3DColor(10,20,30,"RED");
		System.out.println(p.toString()+"입니다.");

		Point3DColor q = new Point3DColor(1,2,3,"BLUE");
		p.move(q);
		System.out.println(p.toString()+"입니다.");
		
		Point3DColor r = new Point3DColor(1,2,3,"RED");
		if(q.equals(r))
			System.out.println("예. 같은 위치 같은 색깔의 점입니다.");
		else
			System.out.println("아니오");
	}

}
