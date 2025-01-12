
class Average{
	double []aver = new double[10];
	int num=0;
	
	void put(int value) {
		aver[num]=value;
		num++;
	}
	
	void showAll() {
		System.out.println("***** 저장된 데이터 모두 출력 *****");
		for(int i=0;i<num;i++)
			System.out.print(aver[i]+" ");
		System.out.print("\n");
	}
	
	double getAvg() {
		double sum=0;
		for(int i=0;i<num;i++)
			sum+=aver[i];
		return sum/num;
	}
}

public class Ch4_4 {

	public static void main(String[] args) {
		Average avg = new Average();
		avg.put(10);
		avg.put(15);
		avg.put(100);
		avg.showAll();
		System.out.println("평균은 "+ avg.getAvg());

	}

}
