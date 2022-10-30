import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        division(5, 0);
        divisionConsoleInput(100);
        divisionConsoleInputArray(new int[]{5, 6, 7}, 5);
        divisionConsoleInputArray1(new int[]{5, 6, 7}, 5);
    }

    private static int division(int a, int b) {// Используем try - catch
        System.out.println("Пытаюсь разделить " + a + " на " + b);
        try {
            System.out.println("Результат" + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }
        return a;
    }

    private static void divisionConsoleInput(int a) {// try-catch, где catch будет несколько
        Scanner s = new Scanner(System.in);
        System.out.println("Числитель - " + a + " Введите число, которе будет знаменателем");
        try {
            int b = Integer.parseInt(s.nextLine());
            System.out.println(a / b);
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число");
        } catch (ArithmeticException e1) {
            System.out.println("На ноль делить нельзя");
        }
    }

    private static void divisionConsoleInputArray(int[] a, int b) { // try -catch, с использованием multi-catch
        System.out.println(Arrays.toString(a));
        Scanner s = new Scanner(System.in);
        System.out.println("Сколько чисел ты видишь на экране?");
        try {
            int length = Integer.parseInt(s.nextLine());
            for (int i = 0; i < length; i++) {
                a[i] = a[i] / b;
                System.out.print(a[i]);
                System.out.println();
            }
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка." + e);
        }
    }

    private static void divisionConsoleInputArray1(int[] a, int b) { // try-catch-finally
        System.out.println(Arrays.toString(a));
        Scanner s = new Scanner(System.in);
        System.out.println("Сколько чисел ты видишь на экране?");
        try {
            int length = Integer.parseInt(s.nextLine());
            if (length >= a.length) {
                for (int i = 0; i < length; i++) {
                    a[i] = a[i] / b;
                    System.out.print(a[i]);
                }
            } else {
                System.out.println("На экране больше чисел");
            }
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка." + e);
        } finally {
            System.out.println("Результат преобразования массива: " + Arrays.toString(a));
        }
    }
}



