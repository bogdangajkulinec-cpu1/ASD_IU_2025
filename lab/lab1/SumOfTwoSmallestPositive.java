import java.util.Scanner;


public class SumOfTwoSmallestPositive {
    public static void main(String[] args) {
        int array [] = inputArray();
        sumOfTwoSmallestPositives(array);
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

    public static void sumOfTwoSmallestPositives(int[] arr) {
            if (arr == null || arr.length < 5) {
                System.out.println("Массив должен содержать минимум 5 элементов");
                return;
            }
            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;
            for (int i = 0; i < arr.length; i++) {
                int current = arr[i];
                if (current > 0) {
                    if (current < smallest) {
                        secondSmallest = smallest;
                        smallest = current;
                    } else if (current < secondSmallest && current != smallest) {
                        secondSmallest = current;
                    }
                }
            }
            if (smallest == Integer.MAX_VALUE || secondSmallest == Integer.MAX_VALUE) {
                System.out.println("В массиве должно быть минимум 2 положительных числа");
            }
            System.out.println(smallest + secondSmallest);
        }
    }

/*
3.Дан массив целых чисел. Минимальное количество элементов – 5 Вернуть
число, которое является суммой двух наименьших положительных чисел.
*/