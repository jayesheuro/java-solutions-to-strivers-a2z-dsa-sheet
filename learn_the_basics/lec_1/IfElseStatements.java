package learn_the_basics.lec_1;

public class IfElseStatements {
    public void studentGrade(int marks) {
//        Grade A if marks >= 90
//        Grade B if marks >= 70
//        Grade C if marks >= 50
//        Grade D if marks >= 35
//        Fail, otherwise
//        Assuming marks will always be in the range 0 to 100
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 70) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        IfElseStatements instance = new IfElseStatements();
        instance.studentGrade(8); //checking for marks 76
    }
}
