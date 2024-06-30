package basicQns;

public class swapping {

    public static void withVariable() {
        int a = 2;
        int b = 3;
        int c;

        c = a; // Store the value of 'a' in 'c'
        a = b; // Assign the value of 'b' to 'a'
        b = c; // Assign the original value of 'a' (stored in 'c') to 'b'

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void withoutVariable(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        withVariable();
        withoutVariable(10, 20);
    }
}
