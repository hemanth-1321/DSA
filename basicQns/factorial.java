package basicQns;

public class factorial {

    public static long factorialNum(int n) {

        long result = 1;
        if (n == 0)
            return 1;

        // for (int i = 1; i <= n; i++) {
        // result = result * i;
        // }
        // return result;

        result = n * factorialNum(n - 1);

        return result;

    }

    public static void main(String[] args) {
        System.out.println(factorialNum(6));
    }
}
