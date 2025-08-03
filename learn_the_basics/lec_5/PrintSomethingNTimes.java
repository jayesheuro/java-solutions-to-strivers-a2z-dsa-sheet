package learn_the_basics.lec_5;

public class PrintSomethingNTimes {
    void printNTimesRecursively(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Jayesh " + n);
        printNTimesRecursively(n-1);
    }

    public static void main(String[] args) {
        PrintSomethingNTimes p = new PrintSomethingNTimes();
        p.printNTimesRecursively(100);

    }
}
