import java.util.Arrays;

public class removedup {

    public static int removedup(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int length = removedup(arr);

        System.out.println("Length: " + length);

        System.out.print("Array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}