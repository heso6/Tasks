package secondTask;

public class ReversedLoop {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversed = new int[10];

        for (int i = numbers.length; i > 0; i--) {

            reversed[i] = i;

            System.out.println(reversed[i]);
        }
    }
}
