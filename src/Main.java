// Задание 1

import java.util.Scanner;

public class Main {
    public static boolean main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a + b >= 10) && (a + b <= 20)) return true;
        else return false;
    }
}

// Задание 2

public class Main {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a + " " + ((a < 0)? "Отрицательное" : "Положительное"));
    }
}

// Задание 3

static boolean (int a){
    if(a < 0){
        return true;
    } else {
        return false;
    }
}

// Задание 4

public class Main {
    public static void main(String[] args) {
        for (int =i; i < 5; i++){
            System.out.println("text");
        }
    }
}

// Задание 5

    static boolean (int year) {
        if (year % 100 != 0 && year % 4 == 0 || year % 400 ==0) return true;
    } else {
        return false;}
        }


// Задание 6



// Задание 7

    int[] array = new int[100];
for (int i = 0; i < 100; i++) {
        array[i] = i + 1;
        }

// Задание 8

static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++)
        if (array[i] < 6)
        array[i] * = 2;
        return array;
        }

// Задание 9

public static void main() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
        if (i == j || i == x) arr[i][j] = 1;
        else arr[i][j] = 0;
        System.out.print(arr[i][j] + " ");
        }
        System.out.print("\n");
        }
        }


// Задание 10

public static void main (int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
        arr[i] = initialValue;
        System.out.print("[" + i + "]" + arr[i] + " ");
        }
        }