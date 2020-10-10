import java.util.Arrays;

public class JavaPractice1 {

    /*
     * Задание 1
     */
    static double calculateAverage(double a, double b) {
        return (a+b)/2;
    }

    /*
     * Задание 2
     */
    static class FLName{
        String name1;
        String name2;

        FLName(String firstName,String lastName) {
            name1 = firstName;
            name2 = lastName;
        }

        String getFirstName() {
            return name1;
        }

        String getLastName() {
            return name2;
        }
    }

    /*
     * Задание 3
     */
    static void fib(int n) {
        int fib0 = 1;
        int fib1 = 1;
        int fib2;

        System.out.print("Fibonacci row: " + fib0 + " " + fib1 + " ");

        for (int i = 3; i <= n; i++) {
            fib2 = fib0 + fib1;
            System.out.print(fib2 + " ");
            fib0 = fib1;
            fib1 = fib2;
        }
        System.out.println();
    }

    /*
     * Задание 4
     */
    static int[] randomizeArray(int size) {
        int[] result = new int[size];

        for(int i = 0; i < size ; i++) {
            result[i] = (int)(Math.random()*20-10);
        }
        return result;
    }

    static void sortArray(int[] array) {
        int array_size = array.length;

        System.out.print("Array: " + Arrays.toString(array));


        System.out.println();

        System.out.print("Sorted array: ");
        for(int i = array_size - 1; i > 0; i--) {
            for(int j = 0; j < i; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }

    public static void main(String[] args) {
        double average = calculateAverage(3.4,10.5);
        FLName myName = new FLName("Alex","Mesch");
        System.out.println("Full name: " + myName.getFirstName() + " " + myName.getLastName());
        fib(15);
        sortArray(randomizeArray(10));
    }
}
