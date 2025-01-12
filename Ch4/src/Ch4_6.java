
class Rectangle{
	int x,y,width,height;
	
	Rectangle(int x,int y, int width,int height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	boolean isSquare() {
		int diff1,diff2;
		diff1 = Math.abs(width-x);
		diff2 = Math.abs(height-y);
		
		if(diff1==diff2)
			return true;
		else
			return false;
	}
	
	void show() {
		System.out.println("("+ x + "," + y +")에서 크기가 "+width + height+"인 사각형");
	}
	
	boolean contains(Rectangle b) {
		 return (b.x >= this.x && b.y >= this.y && 
	                (b.x + b.width) <= (this.x + this.width) && 
	                (b.y + b.height) <= (this.y + this.height));
	}
	
}

public class Ch4_6 {

	public static void main(String[] args) {
		Rectangle a = new Rectangle(3,3,6,6);
		Rectangle b = new Rectangle(4,4,2,3);
		
		a.show();
		if(a.isSquare())
			System.out.println("a는 정사각형입니다.");
		else
			System.out.println("a는 직사각형입니다.");
		
		if(a.contains(b))
			System.out.println("a는 b를 포함합니다.");
	}

}
