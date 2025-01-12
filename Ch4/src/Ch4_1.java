class TV{
		String name;
		int inch;
		int money;

		public TV(String name,int inch, int money) {
			this.name=name;
			this.inch=inch;
			this.money=money;
		}
		
		void show() {
			System.out.println(name+"에서 만든 "+ money +"만원짜리의 "+inch+"인치 TV");
		}
	}
	

public class Ch4_1 {

	public static void main(String[] args) {
		TV tv = new TV("Samsung",50,300);
		tv.show();

	}

}
