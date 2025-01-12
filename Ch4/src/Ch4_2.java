
class Cube{
	int x=0;
	int y=0;
	int height=0;
	
	public Cube(int a, int b, int c) {
		x=a;
		y=b;
		height=c;
	}
	
	void increase(int a, int b, int c) {
		x+=a;
		y+=b;
		height+=c;
	}
	
	int getVolume() {
		int volume = x*y*height;
		return volume;
	}
	
	boolean isZero() {
		if(getVolume()==0)
			return true;
		else
			return false;
	}
}

public class Ch4_2 {

	public static void main(String[] args) {
		Cube cube = new Cube(1,2,3);
		System.out.println("큐브의 부피는 "+cube.getVolume());
		cube.increase(1,2,3);
		System.out.println("큐브의 부피는 "+cube.getVolume());
		if(cube.isZero())
			System.out.println("큐브의 부피는 0");
		else
			System.out.println("큐브의 부피는 0이 아님");

	}

}
