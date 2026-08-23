import java.util.*;

class MultiplesOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 3; i <= n; i = i + 3) {
            System.out.print(i + " ");
        }
    }
}