import java.util.*;

class FindIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int n = sc.nextInt();

        int index = Arrays.binarySearch(a, n);

        if (index >= 0)
            System.out.println(index);
        else
            System.out.println("Not Found");
    }
}