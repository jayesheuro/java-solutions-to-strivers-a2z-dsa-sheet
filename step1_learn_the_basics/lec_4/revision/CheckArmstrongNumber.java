package step1_learn_the_basics.lec_4.revision;
import java.time.Duration;
import java.time.Instant;
public class CheckArmstrongNumber {

    // Precompute powers for digits 0-9 for all possible lengths (up to 10 for 'int')
    private static final long[][] POWER_TABLE = new long[10][11];

    static {
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                POWER_TABLE[i][j] = (long) Math.pow(i, j);
            }
        }
    }
    
    static boolean checkArmstrong(int n) {
        if (n < 0) return false;
        if (n < 10) return true; // Single digits are always Armstrong numbers

        int digits = (int) (Math.log10(n) + 1);
        int nCopy = n;
        long sum = 0;

        while (nCopy > 0) {
            int digit = nCopy % 10;
            sum += POWER_TABLE[digit][digits];
            nCopy /= 10;
            
            // Optimization: If sum already exceeds n, it's not Armstrong
            if (sum > n) return false; 
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Instant start = Instant.now();
        StringBuilder sb = new StringBuilder(); // Buffer output to avoid I/O lag
        
        for (int i = 1; i < 99_999_999; i++) {
            if (checkArmstrong(i)) {
                sb.append(i).append("\n");
            }
        }
        
        System.out.print(sb.toString()); // Print all at once
        Instant end = Instant.now();
        System.out.println("TIME: " + Duration.between(start, end));
    }
}