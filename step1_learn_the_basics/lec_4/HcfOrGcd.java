package step1_learn_the_basics.lec_4;

public class HcfOrGcd {
    public int hcf (int n1 ,int n2) {
        if (n1 <= 0 || n2 <= 0){
            return -1;
        }
        // less optimized O(n)
//        if (n1 == n2){
//            return n1;
//        }
//        int min = Math.min(n1, n2);
//        int hcf = 1;
//        for (int i = 1; i <= min; i++) {
//            hcf = (n1 % i == 0 && n2 % i == 0) ? i : hcf;
//        }
//        return hcf;

//        Euclid's algo - The HCF of two numbers a and b is the same as the HCF of b and a % b
        while(n2 != 0){
            int temp = n2;
            n2 = n1 % n2;
            n1 = temp;
        }
        return n1;
    }

    public static void main(String[] args) {
        HcfOrGcd hcf = new HcfOrGcd();
        System.out.println(hcf.hcf(72,32));
    }
}
