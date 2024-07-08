import java.util.Scanner;

public class fibo {

    // public static void fib(int n) {

    // int a = 0;
    // int b = 1;

    // if (n == 1) {
    // System.out.println(1);
    // }
    // System.out.println(a);
    // System.out.println(b);

    // for (int i = 2; i < n; i++) {
    // int c = a + b;
    // a = b;
    // b = c;
    // System.out.println(c);
    // }

    // }

    public static void fib(int n) {
        int fibos[] = new int[n];
        fibos[0] = 0;
        fibos[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibos[i] = fibos[i - 1] + fibos[i - 2];

        }
        for (int i = 0; i <= n; i++) {

            System.out.println(fibos[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();

        fib(n);
    }
}
