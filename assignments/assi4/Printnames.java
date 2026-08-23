import java.util.*;

class PrintNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a[] = new String[4];

        for (int i = 0; i < 4; i++) {
            a[i] = sc.next();
        }

        for (String x : a) {
            System.out.println(x);
        }
    }
}