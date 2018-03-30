package ua.od.hillel;

/**
 * Lucky tickets`
 * Find all the happy tickets from 100000 to 999999:
 * ticket will be lucky if the sum of the first three digits is equal to the sum of the last three
 * for example, 123312: 1 + 2 + 3 == 3 + 1 + 2
 */
public class task_8 {
    /**
     * This is main performing method
     */


    public static void main(String[] args) {
        lottery();
    }

    /**
     * do all
     */
    public static int lottery() {
        int n = 0;
        for (int i = 100000; i < 1000000; i++) {
            n = i;
        }
        int n6 = n%10;
        n = (int)n/10;
        int n5 = n%10;
        n = (int)n/10;
        int n4 = n%10;
        n = (int)n/10;
        int n3 = n%10;
        n = (int)n/10;
        int n2 = n%10;
        n = (int)n/10;
        int n1 = n%10;

        int sum1 = n1+n2+n3; // Как отловить фиксированное подходящее значение из набора ? ?? !?!!?!?!?!?
        int sum2 = n4+n5+n6;
        int luck = ;
        if (sum1 == sum2){
            System.out.println("You got a few lucky tickets with the numbers: " + luck);
        }else{
            System.out.println("Sorry, you are lucky today :( ");
        }
        return luck;
    }

}
