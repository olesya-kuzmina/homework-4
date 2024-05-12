import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        System.out.println("Задание №3:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк треугольника: ");
        int rows = scanner.nextInt();
        System.out.println("Заполненный равнобедренный треугольник:");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Пустой равнобедренный треугольник:");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (i == rows - 1 || k == 0 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
