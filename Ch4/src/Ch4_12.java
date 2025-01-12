import java.util.Scanner;

class Dictionary{
	private static String [] kor = {"사랑","아기","돈","미래","희망"};
	private static String [] eng = {"love","baby","money","future","hope"};
	String inputKor;
	Scanner scanner = new Scanner(System.in);
	boolean check =false;
	
	public static String kor2Eng(String word) {
		for(int i=0;i<kor.length;i++) {
			if(word.equals(kor[i])) {
				return eng[i];
			}
		}
		return null;
	}
	
	public Dictionary() {
		System.out.println("한영 단어 검색 프로그램입니다.");
		while(true) {
			System.out.print("한글 단어?");
			inputKor = scanner.next();
			
			if(inputKor.equals("그만"))
				break;
					
				if(kor2Eng(inputKor)!= null) {
					System.out.print(inputKor+"은 "+kor2Eng(inputKor)+"\n");
				}else {
					System.out.print(inputKor+"은 저의 사전에 없습니다.\n");
				}
		}
	}
	
}

public class Ch4_12 {

	public static void main(String[] args) {
		new Dictionary();
	}

}
