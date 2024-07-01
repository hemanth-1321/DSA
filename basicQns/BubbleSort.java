package basicQns;

public class BubbleSort {
    public static void bubble(int arr[]) {
        int n = arr.length;
        int temp;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) { // Outer loop runs n-1 times
            for (int j = 0; j < n - 1 - i; j++) { // Inner loop runs n-1-i times
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }

            }
            if (!swapped)
                break;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        System.out.println("Array before sorting:");
        printArray(arr);

        bubble(arr);

        System.out.println("\nArray after sorting:");
        printArray(arr);
    }
}
