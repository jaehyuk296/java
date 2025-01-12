
class Memo{
	
	String name,time,text;
	
	public Memo(String name, String time, String text) {
		this.name=name;
		this.text=text;
		this.time=time;
	}
	
	void show() {
		System.out.println(name+", "+ time+" "+ text);
	}
	
	boolean isSameName(Memo a) {
		if(this.name==a.name)
			return true;
		else
			return false;
	}
	
	String getName() {
		return name;
	}
	
	int length() {
		int size = this.text.length();
		return size;
	}
}

public class Ch4_7 {

	public static void main(String[] args) {
		Memo a = new Memo("유송연" ,"10:10","자바 과제 있음");
		Memo b = new Memo("박채원","10:15","시카고로 어학 연수 가요!");
		Memo c = new Memo("김경미","11:30","사랑하는 사람이 생겼어요.");
		
		a.show();
		if(a.isSameName(b))
			System.out.println("동일한 사람입니다.");
		else
			System.out.println("다른 사람입니다.");
		
		System.out.println(c.getName() + "가 작성한 메모의 길이는 "+c.length());
	}

}
