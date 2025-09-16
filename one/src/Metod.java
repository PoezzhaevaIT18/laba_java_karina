import java.util.Scanner;
public class Metod {
    public double fraction(double x) {                     //1 задание
        return x - (int) x;
    }
    // Метод для безопасного ввода
    public double getInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите вещественное число, результатом будет его дробная часть: ");
            String input = scanner.nextLine().replace(" ", "").replace(",", ".");

            if (input.matches("-?\\d+(\\.\\d+)?")) {
                return Double.parseDouble(input);
            }

            System.out.println("Ошибка! Вещественное число! ");
        }
    }
    public int charToNum(char x) {                            // 2 задание
        if (x >= '0' && x <= '9') {
            return x - '0';
        }
        else {
            return -1;
        }
    }
    // Метод для корректного ввода
    public char getCharInput() {
        Scanner scanner = new Scanner(System.in);
        char input = ' ';
        boolean data = false;
        while (!data) {
            System.out.print("Введите код цифры (0-9), результатом будет соответствующее число: ");
            String userInput = scanner.next();

            if (userInput.length() == 1) {
                input = userInput.charAt(0);
                if (input >= '0' && input <= '9') {
                    data = true;
                }
                else {
                    System.out.println("Ошибка! Введите цифру от 0 до 9.");
                }
            }
            else {
                System.out.println("Ошибка! Введите только один символ.");
            }
        }
        return input;
    }
    public boolean is2Digits(int x) {                        // 3 задание
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }
    // Метод для получения целого числа
    public int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите целое число : ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            else {
                System.out.println("Ошибка! '" + scanner.next() + "' не является целым числом.");
            }
        }
    }
    public boolean isInRange(int a, int b, int num) {             // 4 задание
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return num >= min && num <= max;
    }
    public boolean isEqual(int a, int b, int c) {                // 5 задание
        return a == b && b == c;
    }
    public int abs(int x) {                                        // 6 задание
        if (x < 0)
        {
            return -x;
        }
        else {
            return x;
        }
    }
    public boolean is35(int x) {                                   // 7 задание
        boolean divisibleBy3 = (x % 3 == 0);
        boolean divisibleBy5 = (x % 5 == 0);
        return (divisibleBy3 || divisibleBy5) && !(divisibleBy3 && divisibleBy5);
    }
    public int max3(int x, int y, int z) {                       // 8 задание
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }
    public int sum2(int x, int y) {                            // 9 задание
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        else {
            return sum;
        }
    }
    public String day(int x) {                                   // 10 задание
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }
    public String listNums(int x) {                         // 11 задание
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i < x) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public String chet(int x) {                         // 12 задание
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i + 2 <= x) {
                result.append(" ");
            }
        }
        return result.toString();
    }
    public int numLen(long x) {                         // 13 задание
        if (x == 0) {
            return 1;
        }

        int length = 0;
        long number = Math.abs(x);

        while (number > 0) {
            number = number / 10;
            length++;
        }

        return length;
    }
    // Метод для получения long числа
    public long getLongInput() {
        Scanner scanner = new Scanner(System.in);
        long input = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите целое число: ");
            if (scanner.hasNextLong()) {
                input = scanner.nextLong();
                validInput = true;
            }
            else {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
            }
        }
        return input;
    }
    public void square(int x) {                            // 14 задание
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public void rightTriangle(int x) {                   // 15 задание
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public int findFirst(int[] arr, int x) {               // 16 задание
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    // Метод для создания массива и заполнение его целыми числами
    public int[] getIntArrayInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
    // Метод для вывода массива
    public void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public int maxAbs(int[] arr) {                       // 17 задание
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int maxAbsValue = arr[0];
        int maxAbs = Math.abs(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int currentAbs = Math.abs(arr[i]);
            if (currentAbs > maxAbs) {
                maxAbs = currentAbs;
                maxAbsValue = arr[i];
            }
            else
                if (currentAbs == maxAbs) {
                if (arr[i] < 0) {
                    maxAbsValue = arr[i];
                }
            }
        }
        return maxAbsValue;
    }
    public int[] add(int[] arr, int[] ins, int pos) {        //  18 задание
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[ins.length + i] = arr[i];
        }

        return result;
    }
    public int[] reverseBack(int[] a) {               // 19 задание
        int[] result = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[a.length - 1 - i];
        }

        return result;
    }
    public int[] findAll(int[] arr, int x) {            //20 задание
        int count = 0;
        for (int num : arr) {
            if (num == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }
}

