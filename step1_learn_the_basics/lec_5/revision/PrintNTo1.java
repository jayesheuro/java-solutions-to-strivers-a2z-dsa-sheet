package step1_learn_the_basics.lec_5.revision;

public class PrintNTo1 {
    static void printNTo1(int n) {
        if(n != 0) {
            System.out.println(n);
            printNTo1(n-1);
        }
    }
    public static void main(String[] args) {
        printNTo1(10);
    }
}
