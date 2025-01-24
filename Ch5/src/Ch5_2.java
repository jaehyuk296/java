
class TV{
	private int size;
	public TV(int size) {
		this.size=size;
	}
	
	protected int getSize() {
		return size;
	}
}

class ColorTV extends TV{
	private int color;
	
	public ColorTV(int size,int color) {
		super(size);
		this.color = color;
	}
	
	protected int getColor() {
		return color;
	}
	
	void printProperty() {
		System.out.println(getSize()+"인치 "+getColor()+"컬러");
	}
}

class SmartTV extends ColorTV{
	private String address;
	
	public SmartTV(String address,int size,int color) {
		super(size,color);
		this.address=address;
	}
	
	public String getAddress() {
		return address;
	}


	void printProperty() {
		System.out.println("나의 SmartTV는 "+ getAddress() +" 주소의 "+getSize()+"인치 "+getColor()+"컬러");
	}
}

public class Ch5_2 {

	public static void main(String[] args) {
		SmartTV smartTV = new SmartTV("192.168.0.5",77,20000000);
		smartTV.printProperty();
	}

}
