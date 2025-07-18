import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (a): ");
        int a = sc.nextInt();
        sc.close();
        int terms;
        if (a % 2 == 0) {
            terms = a - 1;
        } else {
            terms = a;
        }

        int count = 0;
        int num = 1;

        while (count < terms) {
            System.out.print(num + " ");
            num += 2;
            count++;
        }
    }
}
