
class VArray{
	int size;
	int store=0;
	int [] array;
	int num;
	
	public VArray() {
		
	}
	
	public VArray(int size) {
		array = new int [size];
		this.size = size;
	}
	
	int capacity() {
		return size;
	}
	
	int size() {
		return store;
	}
	
	void add(int num) {
	    if (store >= size) { // 배열이 가득 찬 경우
	        // 용량을 두 배로 늘린 새 배열 생성
	        int[] newArray = new int[size * 2];
	        for (int i = 0; i < size; i++) {
	            newArray[i] = array[i];
	        }
	        array = newArray; // 기존 배열을 새 배열로 교체
	        size *= 2; // 용량 업데이트
	    }
	    array[store] = num; // 새로운 값을 배열에 추가
	    store++; // 저장된 개수 증가
	}

	
	void printAll() {
		for(int i=0;i<array.length;i++)
			if(i<store)
				System.out.print(array[i]+" ");
		System.out.println();
	}
	
	void insert(int index,int num) {
		if (store >= size) {
            int[] newArray = new int[size * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            size *= 2;
        }

        for (int i = store; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = num;
        store++;
	}
	
	void remove(int num) {
		  for (int i = num; i < store - 1; i++) {
		        array[i] = array[i + 1];
		    }

		    store--; 
		    array[store] = 0;
	}
}

public class Ch4_14 {

	public static void main(String[] args) {
			VArray v= new VArray(5); // 5개의 정수를 저장하는 가변 배열 객체 생성
			System.out.println("용량 : "+ v.capacity() +", 저장된 개수: "+ v.size());
			
			for(int i=0; i<7; i++) // 7개 저장
				v.add(i);
			System.out.println("용량 : "+ v.capacity() +", 저장된 개수: "+ v.size());
			v.printAll();
			
			v.insert(3, 100);
			v.insert(5, 200); 
			System.out.println("용량:"+ v.capacity() + " , 저장된 개수: "+ v. size());
			v. printAll() ;
			
			v. remove(10); // 배열의 인덱스 10의 정수 삭제
			System.out.println("용량:"+ v.capacity() + " , 저장된 개수: "+ v. size());
			v. printAll();
			
			for(int i=50; i<55; i++) // 5개 저장
				v.add(i); // 배열에 순서대로 정수 i 값 저장
			System.out.println("용량:" + v.capacity() +", 저장된 개수:" + v.size());
			v.printAll();
			
	}

}
