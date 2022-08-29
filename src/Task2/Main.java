package Task2;

public class Main {

    public static void main(String[] args) {
        int[] second = {5,6,3,2,5,1,4,9};
        int temp;
        for (int i = 0; i < second.length; i++) {
            if (i >= second.length) {
                throw new ArrayIndexOutOfBoundsException("Вышли за пределы индекса массива: i=" + i);
            }
            for (int j = second.length - 1; j > i; j--) {
                if (second[j-1] > second[j]) {
                    temp = second[j-1];
                    second[j-1] = second[j];
                    second[j] = temp;
                }
            }
        }
        for (int i : second) {
            System.out.print(i + " ");
        }
    }
}
