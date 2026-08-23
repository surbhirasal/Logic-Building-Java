import java.util.*;

class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int n = sc.nextInt();
        boolean found = false;

        for (int x : a) {
            if (x == n) {
                found = true;
            }
        }

        if (found)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}