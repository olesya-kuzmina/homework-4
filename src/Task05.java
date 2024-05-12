import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        System.out.println("Задание № 5");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк параллелограмма: ");
        int rows = scanner.nextInt();
        System.out.println("Заполненный параллелограмм:");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < rows; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("Пустой параллелограмм:");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < rows; k++) {
                if (i == 0 || i == rows - 1 || k == 0 || k == rows - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}