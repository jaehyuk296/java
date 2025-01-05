import java.util.Scanner;

public class Ch3_7 {

	 public Ch3_7() {
	        int[] array = new int[10];
	        Scanner scanner = new Scanner(System.in);
	        int ran;
            int sum = 0;

	        System.out.print("랜덤한 정수들... ");

	        for (int i = 0; i < array.length; i++) {
	            ran = (int)(Math.random()*9)+11;
	        	array[i] = ran; 
	        }

	        for (int i = 0; i < array.length; i++) {
	        	System.out.print(array[i]+" ");
	            sum +=array[i];
	        }
	        System.out.println("\n평균은 ");
	        sum/=array.length;
	        
	        System.out.println(sum);
	        System.out.println(); // 줄 바꿈
	        scanner.close(); // Scanner 닫기
	    }
	
	public static void main(String[] args) {
		new Ch3_7();

	}

}
