import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        System.out.println("Задание №4:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк ромба: ");
        int rows = scanner.nextInt();
        System.out.println("Заполненный ромб:");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("Пустой ромб:");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                if (k == 0 || k == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
