package learn_the_basics.lec_5;

public class PrintNTo1 {
    void printNTo1(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }

    public static void main(String[] args) {
        PrintNTo1 p = new PrintNTo1();
        p.printNTo1(100);
    }
}
