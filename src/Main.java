import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //task1
        int[] arr = {5, 2, 8, 1, 7, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int number : arr) {
            System.out.print(number + " ");
        }

        //task2
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first index: ");
        int index1 = scanner.nextInt();
        System.out.print("Enter second index: ");
        int index2 = scanner.nextInt();

        int[] arr1 = {12, 28, 3, 20, 5};
        int c = arr1[index1] ;
        arr1[index1] = arr1[index2];
        arr1[index2] = c;
        for (int number : arr1) {
            System.out.print(number + " ");
        }

        //task3
        // 3) Array-dən yalnız cüt ədədləri saxla, tək ədədləri sil.
        int[] arr2 = {5, 2, 8, 1, 7, 4};
        int evenCount = 0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%2==0) {
                evenCount++;
            }
        }
        int[] arr3 = new int[evenCount];
        int a = 0;

        for (int i = 0; i < arr2.length; i++) {
            if(arr2[i]%2==0) {
                arr3[a++] = arr2[i];
            }
        }

        for (int number : arr3) {
            System.out.print(number + " ");
        }

        //task4
        //4) Array-də təkrarlanan elementləri tap və sil, hər element yalnız bir dəfə qalsın.
        int[] array = {1, 2, 1, 8, 1, 4, 4};

        for (int i = 0; i < array.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(array[i] + " ");
            }
        }

        //task5
        int[] array1 = {12, 20, 1, 15, 34, 9};
        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                secondMax = max;
                max = array1[i];
            } else if (array1[i] < max && array1[i] > secondMax) {
                secondMax = array1[i];
            }
        }
        System.out.println("Second Max: " + secondMax);
    }
}