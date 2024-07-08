package basicQns;

public class minMAx {
    public static int max(int arr[]) {
        int n = arr.length;
        int maxValue = arr[0];
        for (int i = 0; i <= n - 1; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        System.out.println(max(arr));
    }
}
