import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите номер блока задач (1-4): ");
        number1 = scanner.nextInt();
        switch (number1) {
            case 1:
                System.out.println("Введите номер подзадания (1-5): ");
                number2 = scanner.nextInt();
                switch (number2) {
                    case 1:
                        Metod x = new Metod();
                        double number = x.getInput();
                        double fractionalPart = x.fraction(number);
                        System.out.printf("Дробная часть числа: %f%n ", fractionalPart);
                        break;
                    case 2:
                        Metod x2 = new Metod();
                        char symbol = x2.getCharInput();
                        int res = x2.charToNum(symbol);
                        System.out.printf("Символ '%c' преобразован в число: %d%n", symbol, res);
                        break;
                    case 3:
                        Metod x3 = new Metod();
                        int num = x3.getIntInput();
                        boolean isTwoDigit = x3.is2Digits(num);
                        System.out.println("Проверка на двузначность: ");
                        System.out.printf("Число: %d%n", num);
                        System.out.printf("Двузначное: %s%n", isTwoDigit ? "true" : "false");
                        break;
                    case 4:
                        Metod x4 = new Metod();
                        System.out.print("Введите границу a: ");
                        int a = x4.getIntInput();
                        System.out.print("Введите границу b: ");
                        int b = x4.getIntInput();
                        System.out.print("Введите число для проверки: ");
                        int CheckNum = x4.getIntInput();
                        boolean inRange = x4.isInRange(a, b, CheckNum);
                        System.out.println("Проверка диапазона, определяем границы и проверяем входит ли туда число: ");
                        System.out.printf("Границы: [%d, %d]%n", Math.min(a,b), Math.max(a, b));
                        System.out.printf("Проверяемое число: %d%n", CheckNum);
                        System.out.printf("Входит в диапазон: %s%n", inRange ? "true" : "false");
                        break;
                    case 5:
                        Metod x5 = new Metod();
                        System.out.println("Введите число a: ");
                        int num1 = x5.getIntInput();
                        System.out.println("Введите число b: ");
                        int num2 = x5.getIntInput();
                        System.out.println("Введите число c: ");
                        int num3 = x5.getIntInput();
                        boolean areEqual = x5.isEqual(num1, num2, num3);
                        System.out.println("Проверка равенства чисел");
                        System.out.printf("Числа: %d, %d, %d%n", num1, num2, num3);
                        System.out.printf("Все числа равны: %s%n", areEqual ? "true" : "false");
                        break;
                    default: System.out.println("Неверный номер подзадания!");
                }
                break;

            case 2:
                System.out.println("Введите номер подзадания: ");
                number2 = scanner.nextInt();
                switch(number2) {
                    case 1:
                        Metod x21 = new Metod();
                        int number = x21.getIntInput();
                        int absoluteValue = x21.abs(number);
                        System.out.print("Модуль числа: ");
                        System.out.printf("Исходное число: %d%n", number);
                        System.out.printf("Модуль числа: %d%n", absoluteValue);
                        System.out.printf("|%d| = %d%n", number, absoluteValue);
                        break;
                    case 2:
                        Metod x22 = new Metod();
                        System.out.println("35 (true - делится нацело на 3 или на 5, иначе false)");
                        int num = x22.getIntInput();
                        boolean result = x22.is35(num);
                        System.out.printf("Число: %d%n", num);
                        System.out.printf("Делится на 3: %s%n", (num % 3 == 0) ? "да" : "нет");
                        System.out.printf("Делится на 5: %s%n", (num % 5 == 0) ? "да" : "нет");
                        System.out.printf("Результат: %s%n", result ? "true" : "false");
                        break;
                    case 3:
                        Metod x23 = new Metod();
                        System.out.println("Тройной максимум ( из чисел будет выбрано наибольшее)");
                        System.out.println("Введите число x: ");
                        int x = x23.getIntInput();
                        System.out.println("Введите число y: ");
                        int y = x23.getIntInput();
                        System.out.println("Введите число z: ");
                        int z = x23.getIntInput();
                        int max = x23.max3(x, y, z);
                        System.out.println("тройной максимум: ");
                        System.out.printf("Числа: x=%d, y=%d, z=%d%n", x, y, z);
                        System.out.printf("Максимальное число: %d%n", max);
                        break;
                    case 4:
                        Metod x24 = new Metod();
                        System.out.println("Двойная сумма (выводит сумма, за исключением если сумма попадает в диапазон от 10-19)");
                        System.out.println("Введите число x: ");
                        int xNum = x24.getIntInput();
                        System.out.println("Введите число y: ");
                        int yNum = x24.getIntInput();
                        int sumResult = x24.sum2(xNum, yNum);
                        System.out.printf("Числа: x=%d, y=%d%n", xNum, yNum);
                        System.out.printf("Сумма: %d + %d = %d%n", xNum, yNum, xNum + yNum);
                        System.out.printf("Результат: %d%n", sumResult);
                        break;
                    case 5:
                        Metod x25 = new Metod();
                        System.out.print("Введите номер дня недели (1-7): ");
                        int dayNumber = x25.getIntInput();
                        String dayName = x25.day(dayNumber);
                        System.out.printf("Номер дня: %d%n", dayNumber);
                        System.out.printf("День недели: %s%n", dayName);
                        break;
                    default: System.out.println("Неверный номер подзадания!");
                }
                break;

            case 3:
                System.out.println("Введите номер подзадания: ");
                number2 = scanner.nextInt();
                switch(number2) {
                    case 1:
                        Metod x31 = new Metod();
                        System.out.print("Введите число x, которое будет разложенно от 0 до x : ");
                        int xNum = x31.getIntInput();
                        String numbersList = x31.listNums(xNum);
                        System.out.println("числа подряд: ");
                        System.out.printf("Число x: %d%n", xNum);
                        System.out.printf("Результат: \"%s\"%n", numbersList);
                        break;
                    case 2:
                        Metod x32 = new Metod();
                        System.out.println("Введите число x, которое будте также разложено, но в выводе будут четные цифры : ");
                        int xValue = x32.getIntInput();
                        String evenNumbers = x32.chet(xValue);
                        System.out.printf("Число x: %d%n", xValue);
                        System.out.printf("Результат: \"%s\"%n", evenNumbers);
                        break;
                    case 3:
                        Metod x33 = new Metod();
                        System.out.println("Программа считает количество цифр: ");
                        long longNumber = x33.getLongInput();
                        int length = x33.numLen(longNumber);
                        System.out.printf("Число: %d%n", longNumber);
                        System.out.printf("Количество цифр: %d%n", length);
                        break;
                    case 4:
                        Metod x34 = new Metod();
                        System.out.print("Введите размер квадрата: ");
                        int size = x34.getIntInput();
                        System.out.println("Квадрат " + size + "x" + size + ":");
                        x34.square(size);
                        break;
                    case 5:
                        Metod x35 = new Metod();
                        System.out.print("Введите высоту треугольника: ");
                        int h = x35.getIntInput();
                        System.out.println("Правый треугольник высотой " + h + ":");
                        x35.rightTriangle(h);
                        break;
                    default: System.out.println("Неверный номер подзадания!");
                }
                break;

            case 4:
                System.out.println("Введите номер подзадания: ");
                number2 = scanner.nextInt();
                switch(number2) {
                    case 1:
                        Metod x41 = new Metod();
                        System.out.println("Программа возвращает индекс первого вхождения числа в массив. ");
                        int[] array = x41.getIntArrayInput();
                        System.out.print("Введите число для поиска : ");
                        int searchNumber = x41.getIntInput();
                        System.out.print("Массив: ");
                        x41.printArray(array);
                        System.out.println("Искомое число: " + searchNumber);
                        int result = x41.findFirst(array, searchNumber);
                        if (result != -1) {
                            System.out.println("Первое вхождение найдено по индексу: " + result);
                        }
                        else {
                            System.out.println("Число не найдено в массиве");
                        }
                        break;
                    case 2:
                        Metod x42 = new Metod();
                        int[] array2 = x42.getIntArrayInput();
                        System.out.print("Массив: ");
                        x42.printArray(array2);
                        int maxAbsResult = x42.maxAbs(array2);
                        System.out.println("Наибольшее по модулю значение: " + maxAbsResult);
                        System.out.println("Модуль: " + Math.abs(maxAbsResult));
                        break;
                    case 3:
                        Metod x43 = new Metod();
                        System.out.println("Ввод первого массива: ");
                        System.out.print("Количество элементов в первом массиве: ");
                        int size1 = scanner.nextInt();
                        int[] mainArray = new int[size1];
                        System.out.println("Введите " + size1 + " чисел:");
                        for (int i = 0; i < size1; i++) {
                            mainArray[i] = scanner.nextInt();
                        }
                        System.out.println("\nВвод массива для вставки:");
                        System.out.print("Количество элементов во втором массиве: ");
                        int size2 = scanner.nextInt();
                        int[] insertArray = new int[size2];
                        System.out.println("Введите " + size2 + " чисел:");
                        for (int i = 0; i < size2; i++) {
                            insertArray[i] = scanner.nextInt();
                        }
                        System.out.println("\nВыбор позиции:");
                        System.out.print("На какую позицию вставить: (0-" + size1 + "): ");
                        int position = scanner.nextInt();
                        System.out.println("\nРезультат");
                        System.out.print("Первый массив: ");
                        x43.printArray(mainArray);
                        System.out.print("Вставляемый массив: ");
                        x43.printArray(insertArray);
                        System.out.println("Позиция вставки: " + position);
                        int[] resultArray = x43.add(mainArray, insertArray, position);
                        System.out.print("Итоговый массив: ");
                        x43.printArray(resultArray);
                        break;
                    case 4:
                        Metod x44 = new Metod();
                        System.out.println("Реверс массива");
                        System.out.print("Сколько элементов в массиве? ");
                        int size = scanner.nextInt();
                        int[] arr = new int[size];
                        System.out.println("Введите " + size + " чисел:");
                        for (int i = 0; i < size; i++) {
                            arr[i] = scanner.nextInt();
                        }
                        System.out.println("\nРезультат");
                        System.out.print("Исходный массив: ");
                        x44.printArray(arr);
                        int[] reversedArray = x44.reverseBack(arr);
                        System.out.print("Перевернутый массив: ");
                        x44.printArray(reversedArray);
                        break;
                    case 5:
                        Metod x45 = new Metod();
                        System.out.println("Поиск всех вхождений");
                        System.out.print("Сколько элементов в массиве? ");
                        int m = scanner.nextInt();
                        int[] ar = new int[m];
                        System.out.println("Введите " + m + " чисел:");
                        for (int i = 0; i < m; i++) {
                            ar[i] = scanner.nextInt();
                        }
                        System.out.print("Какое число ищем? ");
                        int num = scanner.nextInt();
                        System.out.println("\nРезультат");
                        System.out.print("Массив: ");
                        x45.printArray(ar);
                        System.out.println("Искомое число: " + num);
                        int[] foundIndices = x45.findAll(ar, num);
                        if (foundIndices.length > 0) {
                            System.out.print("Индексы вхождений: ");
                            x45.printArray(foundIndices);
                            System.out.println("Количество вхождений: " + foundIndices.length);
                        }
                        else {
                            System.out.println("Число " + num + " не найдено в массиве");
                        }
                        break;
                    default:
                        System.out.println("Неверный номер подзадания!");
                }
                break;
        }
    }
}
