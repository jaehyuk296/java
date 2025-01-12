
class Account{
	int money=0;
	
	public Account(int money) {
		this.money=money;
	}
	
	void deposit(int money) {
		this.money+=money;
	}
	
	void deposit(int []bulk) {
		for(int i=0;i<bulk.length;i++) {
			this.money += bulk[i];
		}
	}
	
	int withdraw(int money) {
		this.money-=money;
		return money;
	}
	
	int getBalance() {
		return money;
	}
}

public class Ch4_8 {

	public static void main(String[] args) {
		Account a = new Account(100);
		a.deposit(5000);
		System.out.println("잔금은 "+a.getBalance()+"원입니다.");
		
		int bulk[]= {100,500,200,700};
		a.deposit(bulk);
		System.out.println("잔금은 "+a.getBalance()+"원입니다.");
		
		int money=1000;
		int wMoney = a.withdraw(money);
		if(wMoney < money)
			System.out.println(wMoney + "원만 인출");
		else
			System.out.println(wMoney + "원만 인출");
		
		System.out.println("잔금은 "+a.getBalance()+"원입니다.");

	}

}
