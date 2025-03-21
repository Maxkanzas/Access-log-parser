import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Создаем объект Scanner для чтения ввода из консоли
        Scanner scanner = new Scanner(System.in);

        // Получаем первое число
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        // Получаем второе число
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        // Вычисляем сумму, разность, произведение и частное
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        // Выводим результаты в консоль
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}