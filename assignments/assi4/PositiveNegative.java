import java.util.*;

class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 6; i++) {
            int n = sc.nextInt();

            if (n > 0)
                positive++;
            else if (n < 0)
                negative++;
        }

        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}