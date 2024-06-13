package session_4;

public class ForStatement {
    public static void main(String[] args) {
//        printNumbers(10);
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(array);
    }
//    public static void printNumbers(int number) {
//        for (int i = 0; i < number; i++){
//            System.out.println(i);
//        }
//    }

    public static void printArray(int[] numbersArray) {
        for (int number : numbersArray) {
            System.out.println(number);
        }
    }

}
