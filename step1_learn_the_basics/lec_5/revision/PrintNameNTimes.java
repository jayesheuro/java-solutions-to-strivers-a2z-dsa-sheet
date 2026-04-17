package step1_learn_the_basics.lec_5.revision;

public class PrintNameNTimes {
    static void printName(String name, int n){
        if(n != 0){
            System.out.println(name);
            printName(name, n - 1);
        }
    }
    public static void main(String[] args) {
        printName("Vision", 5);
    }
}
