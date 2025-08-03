package learn_the_basics.lec_5;

public class PrintNameNTimes {
    void printNameNTimesRecursively(int n, String name) {
        if(n == 0) {
            return;
        }
        System.out.println(name);
        printNameNTimesRecursively(n-1, name);
    }

    public static void main(String[] args) {
        PrintNameNTimes p = new PrintNameNTimes();
        p.printNameNTimesRecursively(100, "Jayesh Singh");
    }
}
