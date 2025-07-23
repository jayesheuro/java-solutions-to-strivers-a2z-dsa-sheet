package learn_the_basics.lec_4;

public class HcfOrGcd {
    public int hcf (int n1 ,int n2) {
        int min = Math.min(n1, n2);
        int hcf = 1;
        for (int i = 1; i <= min; i++) {
            hcf = (n1 % i == 0 && n2 % i == 0) ? i : hcf;
        }
        return hcf;
    }

    public static void main(String[] args) {
        HcfOrGcd hcf = new HcfOrGcd();
        System.out.println(hcf.hcf(72,32));
    }
}
