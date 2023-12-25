package DataStructures.Array.ReverseArray;

public class SwappingArray {
    public static void reverse(int arr[], int n) {
        int temp;
        for (int i = 0; i < n / 2; i++) {
            temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i -1] = temp;
        }

        System.out.print("Reversed array is:");
        for(int k = 0; k < n; k++ ) {
            System.out.print(" " + arr[k]);
        }
    }

    public static void main(String[] args) {
        int [] arr = { 10, 20, 30, 40, 50 };
        reverse(arr, arr.length);
    }
}
