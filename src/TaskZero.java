import java.util.Scanner;

public class  TaskZero {
    public static void main(String[] args) {
        int[] array = inputArray();
        insertionSort(array);
        System.out.println("Отсортированный массив: ");
        printArray(array);
        System.out.println("Введите элемент: ");
        int number = inputNumber();
        binarySearch(array, number);
        recursiveBinarySearch(array, 0,array.length-1, number);
    }
    public static int[] inputArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите " + length + " элементов массива:");
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент [" + i + "]: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void insertionSort(int[] arr) {
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public static void binarySearch(int[] array, int number){
        int leftBorder = 0;
        int rightBorder = array.length - 1;
        boolean flag = false;
        while (leftBorder <= rightBorder) {
            int middleNumber = (leftBorder + rightBorder) / 2;
            if (array[middleNumber] == number){
                System.out.println("Элемент " + number + " найден");
                flag = true;
                break;
            }
            else if(array[middleNumber] < number){
                leftBorder = middleNumber + 1;
            }
            else {
                rightBorder = middleNumber - 1;
            }
        }
        if (flag != true) {
            System.out.println("Элемент " + number + " не найден");
        }
    }

    public static int recursiveBinarySearch(int arr[], int leftBorder, int rightBorder, int number){
        if (leftBorder > rightBorder) {
            System.out.println("Элемент " + number + " не найден");
            return -1;
        }
        int middleNumber = (leftBorder + rightBorder) / 2;
        if (arr[middleNumber] == number){
            System.out.println("Элемент " + number + " найден");
            return middleNumber;
        }
        else if(arr[middleNumber] < number){
            return recursiveBinarySearch(arr, middleNumber + 1, rightBorder, number);
        }
        else {
            return recursiveBinarySearch(arr, leftBorder, middleNumber - 1, number);
        }
    }
}

/*
Реализовать алгоритм бинарного поиска двумя способами.
 */