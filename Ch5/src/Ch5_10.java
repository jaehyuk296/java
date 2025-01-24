import java.util.Scanner;

class BaseArray {
    protected int array[];
    protected int nextIndex = 0;

    public BaseArray(int size) {
        array = new int[size];
    }

    public int length() {
        return array.length;
    }

    public void add(int n) {
        if (nextIndex == array.length)
            return;
        array[nextIndex] = n;
        nextIndex++;
    }

    public void print() {
        for (int i = 0; i < nextIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

class SortedArray extends BaseArray {
    public SortedArray(int size) {
        super(size);
    }

    @Override
    public void add(int n) {
        if (nextIndex == array.length) {
            return;
        }
        // Add the number at the next available index
        array[nextIndex] = n;

        // Sort the array up to the next index
        for (int i = nextIndex; i > 0; i--) {
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            } else {
                break;
            }
        }
        nextIndex++;
    }
}

public class Ch5_10 {
    public static void main(String[] args) {
        SortedArray sArray = new SortedArray(10);
        Scanner scanner = new Scanner(System.in);

        System.out.print(">> ");
        for (int i = 0; i < sArray.length(); i++) {
            int n = scanner.nextInt();
            sArray.add(n);
        }

        sArray.print();
        scanner.close();
    }
}
