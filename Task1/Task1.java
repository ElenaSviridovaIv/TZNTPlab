import java.util.Scanner;

public class Task1
{
public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
            System.out.println("Введите длину массива (после нажмите Enter)");
            int n = in.nextInt();
        System.out.println("Введите длину интервала (после нажмите Enter)");
        int m = in.nextInt();
int current = 1;
System.out.print("Полученный путь: ");
//запускаем цикл
do {
    System.out.print(current);
    current = (current + m - 2) % n + 1; 
} while (current != 1);
} }
// P.S.: задание лёгкое, комментарии излишни 