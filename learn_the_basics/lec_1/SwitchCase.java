package learn_the_basics.lec_1;

public class SwitchCase {
//    Given the integer day denoting the day number, print on the screen which day of the week it is.
//    Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
//    Ensure only the 1st letter of the answer is capitalised.
    public void whichWeekDay(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        SwitchCase sc = new SwitchCase();
        sc.whichWeekDay(3); //Wednesday
    }
}
