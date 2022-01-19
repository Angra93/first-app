import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        int[] arr = new int[10];

        fibonacci(arr);
        System.out.println(Arrays.toString(arr));

        fibonacci2(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void fibonacci2(int[] arr) {
        if ((arr[0] == 1) || (arr[0] == 0)) {
            return;
        }
        for (int i = 2; i <arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];

        }
        fibonacci2(arr);

    }

    private static int fibonacci(int[] arr) {

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++)
            arr[i] = arr[i - 1] + arr[i - 2];

        if ((arr[1] == 1) || (arr[0] == 0))
            return 1;

        return fibonacci(arr);
    }
}
