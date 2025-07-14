package learn_the_basics.lec_1;

import java.util.Scanner;

class UserInputOutput {
    // the required function
    public void printNumber(Scanner sc) {
        int input = sc.nextInt();
        System.out.print(input);
    }

    // main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserInputOutput uio = new UserInputOutput();
        uio.printNumber(sc);
    }
}