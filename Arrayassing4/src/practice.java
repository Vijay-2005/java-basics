import java.util.Arrays;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the number of elements in the array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Type the elements of the array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int[] arr_negative = new int[n];
        int[] arr_positive = new int[n];
        int negIndex = 0;
        int posIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                arr_negative[negIndex] = array[i];
                negIndex++;
            } else {
                arr_positive[posIndex] = array[i];
                posIndex++;
            }
        }

        int negCount = negIndex;
        int posCount = posIndex;

        System.out.println(Arrays.toString(arr_negative));
        System.out.println(Arrays.toString(arr_positive));

        int resultLength = negCount + posCount;
        int[] arr_result = new int[resultLength];
        int i = 0;
        negIndex = 0;
        posIndex = 0;

        // Arrange positive and negative numbers alternately
        while (negIndex < negCount && posIndex < posCount) {
            arr_result[i] = arr_negative[negIndex];
            i++;
            arr_result[i] = arr_positive[posIndex];
            i++;
            negIndex++;
            posIndex++;
        }

        // Add remaining negative numbers, if any
        while (negIndex < negCount) {
            arr_result[i] = arr_negative[negIndex];
            i++;
            negIndex++;
        }

        // Add remaining positive numbers, if any
        while (posIndex < posCount) {
            arr_result[i] = arr_positive[posIndex];
            i++;
            posIndex++;
        }

        System.out.println(Arrays.toString(arr_result));
    }
}



