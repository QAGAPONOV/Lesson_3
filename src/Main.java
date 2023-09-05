// Задание 1

<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static boolean main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if ((a + b >= 10) && (a + b <= 20)) return true;
=======
public class Main {
    static boolean workOne (int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
>>>>>>> 978253a (Исправил)
        else return false;
    }
}

// Задание 2

<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a + " " + ((a < 0)? "Отрицательное" : "Положительное"));
=======
public class WorkTwo {
    public static void main(String[] args) {
        int a = 0;
        if (a >= 0) System.out.println(a + " Положительное");
        else System.out.println(a + " Отрицательное");
>>>>>>> 978253a (Исправил)
    }
}

// Задание 3

<<<<<<< HEAD
static boolean (int a){
    if(a < 0){
        return true;
    } else {
        return false;
    }
=======
static boolean workThree (int a){
    if (a < 0) return true;
    return false;
>>>>>>> 978253a (Исправил)
}

// Задание 4

<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        for (int =i; i < 5; i++){
            System.out.println("text");
        }
=======
public class WorkFour {
    public static void main(String[] args) {
        String String = "text";
        for (int i = 0; i < 5; i++)
            System.out.println("text");
>>>>>>> 978253a (Исправил)
    }
}

// Задание 5

<<<<<<< HEAD
    static boolean (int year) {
        if (year % 100 != 0 && year % 4 == 0 || year % 400 ==0) return true;
    } else {
        return false;}
=======
        public class WorkFive {
            public static void main(String[] args) {
                int year = 399;
                if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) System.out.println(year + " г. не високосный");
                else System.out.println(year + " г. високосный");
            }
>>>>>>> 978253a (Исправил)
        }


// Задание 6

<<<<<<< HEAD


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
=======
public class WorkSix {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("BEFORE: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

// Задание 7

public class WorkSeven {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++) {
            if (i > 100) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}

// Задание 8
public class WorkEight {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.print("\nAFTER:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

}

// Задание 9
public class WorkNine {
    public static void main(String[] args) {
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
}


// Задание 10
public class WorkTen {
    public static void main(String[] args) {
        int len = 5;
        int initialValue = 7;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

}
>>>>>>> 978253a (Исправил)
