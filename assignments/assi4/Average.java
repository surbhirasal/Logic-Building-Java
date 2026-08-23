import java.util.*;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println(sum / 5.0);
    }
}