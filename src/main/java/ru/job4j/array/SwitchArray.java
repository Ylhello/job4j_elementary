package ru.job4j.array;

public class SwitchArray {
    public static int[] swap(int[] array, int source, int destination) {
        int temp = array[source];
        array[source] = array[destination];
        array[destination] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        return swap(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        int[] result = swapBorder(numbers);
        for (int num : result) {
            System.out.println(num);
        }

        int[] swapped = swap(numbers, 1, 4);
        for (int num : swapped) {
            System.out.println(num);
        }
    }
}

