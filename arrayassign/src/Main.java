import java.util.Scanner;
public class Main {
    static void printArray(int arr[]){
        for(int i=0 ; i < arr.length; i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    static void changeArray(int arr[]){
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter size of array");
//        int n = sc.nextInt();
        int arr_1[] = new int[5];
        arr_1[0] =4;
        arr_1[1] =5;
        arr_1[2] =6;
        arr_1[3] =7;
        arr_1[4] =8;
        System.out.println("first original array");
        printArray(arr_1);


        int arr_2[] = arr_1.clone()  ;//trying to copy a value  of arr_1
        System.out.println("Second array");
        printArray(arr_2);
//        now we are changing the value of array2
        arr_2[1] = 2;
        arr_2[2] = 2;
        printArray(arr_1);
        printArray(arr_2);
        changeArray(arr_2); //now we are changing the value of arr2 to 0
        printArray(arr_2); // when we print the array all value of array two is 0
        printArray(arr_1);// the value of array one is change on changing the value of array 2 because both arr1and2 use one copy

    }
}