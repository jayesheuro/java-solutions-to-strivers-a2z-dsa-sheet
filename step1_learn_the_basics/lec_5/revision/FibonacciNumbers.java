package step1_learn_the_basics.lec_5.revision;

public class FibonacciNumbers {
    static void printFib(int pos, int first, int second) {
        if(pos == 0) return;
        System.out.print(first + " ");
        printFib(pos - 1, second, first + second); 
    }

    public static void main(String[] args) {
        int num = 10; //determines how many fibonacci numbers from the start we wanna print
        printFib(num, 0, 1);
    }
}
