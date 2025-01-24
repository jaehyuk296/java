
abstract class PairMap{
	protected String keyArray[];
	protected String valueArray[];
	abstract public String get(String key);
	abstract public void put(String key, String value);
	
	abstract public String delete(String key);
	
	abstract public int length();
}

class Dictionary extends PairMap{
	int size;
	String temp;
	int save = 0;
	
	public Dictionary(int size) {
		this.size = size;
		keyArray = new String [size];
		valueArray = new String [size];
	}
	
	public String get(String key) {
		for(int i=0;i<size;i++) {
			if(keyArray[i]==key)
				temp = valueArray[i];
		}
		return temp;
	}
	
	public void put(String key, String value) {
		for(int i=0;i<size;i++){
			if(keyArray[i]==key) { 
				keyArray[i]=value;
			}
		}
		keyArray[save]=key;
		valueArray[save]=value;
		save++;
	}
	
	public String delete(String key) {
		for(int i=0;i<size;i++){
			if(keyArray[i]==key) {
				temp=keyArray[i];
				valueArray[i]="null";
			}
		}
		save--;
		return temp;
	}
	
	public int length() {
		return size;
	}
}

public class Ch5_12 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		dic.put("황기태", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}

}
