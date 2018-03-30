package ua.od.hillel;

/**
 * Create a program that displays the first 55 elements of the sequence 1 3 5 7 9 11 13 15 17 ....
 */
public class task_2 {
    /**
     * This is main performing method
     */
    public static void main(String[] args) {
        System.out.println("Your sequence: ");
        int n = 1;
        for (int i = 0; i < 55; i++) {
            System.out.print(n + ", ");
            n += 2;

        }

    }
}

