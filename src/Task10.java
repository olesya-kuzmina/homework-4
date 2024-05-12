import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("Задание № 10");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String s = scanner.nextLine();
        int n = 5; //ширина цифры
        int mid = n / 2 + 1;
        for (int k = 1; k <= n; k++) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = 1; j <= n; j++) {
                    boolean draw;
                    switch (s.charAt(i)) {
                        case '0':
                            draw = (j == 1 || j == n) || (k == 1 || k == n);
                            break;
                        case '1':
                            draw = j == mid || k == n || (k + j == mid && j <= mid);
                            break;
                        default:
                            continue;  // Пропускать символы, не являющиеся '0' или '1'
                    }
                    System.out.print(draw ? "*" : " ");
                }
                System.out.print(" "); // Пробел между цифрами
            }
            System.out.println(); // Перенос строки после отрисовки каждого ряда
        }
    }
}