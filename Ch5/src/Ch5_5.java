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

class Point3D extends Point{
	int z;
	
	public Point3D(int x, int y, int z) {
		super(3,2);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}
	
	@Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", "+getZ()+")의 점";
    }
	
	void moveup(int a){
		this.z+=a;
	}
	
	void movedown(int a){
		this.z-=a;
	}
	
	void move(int a,int b, int c){
		move(a,b);
		this.z=c;
	}
}

public class Ch5_5 {

	public static void main(String[] args) {
		Point3D p = new Point3D(3,2,1);
		System.out.println(p.toString()+"입니다.");
		
		p.moveup(3);
		System.out.println(p.toString()+"입니다.");
		
		p.movedown(2);
		System.out.println(p.toString()+"입니다.");

		
		p.move(5,5);
		System.out.println(p.toString()+"입니다.");
		
		p.move(100,200,300);
		System.out.println(p.toString()+"입니다.");
	}

}
