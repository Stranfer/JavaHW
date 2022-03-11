import java.util.Scanner;

public class Average {
    public static double average1(String Double) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число диапазона: ");
        int number1 = scanner.nextInt();

        System.out.println("Введите конечное число диапазона: ");
        int number2 = scanner.nextInt();

        int count1 = 0;
        int sum1 = 0;

        while (number1 <= number2) {
            sum1 += number1;
            ++number1;
            ++count1;
        }
        double avg = (double) sum1 / count1;
        return (double) avg;
    }

    public static double average2(String Double) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите начальное число диапазона: ");
        int number3 = scanner.nextInt();

        System.out.println("Введите конечное число диапазона: ");
        int number4 = scanner.nextInt();

        int count2 = 0;
        int sum2 = 0;

        while (number3 <= number4 && number3 % 2 == 0) {
            sum2 += number3;
            ++number3;
            ++count2;
        }
        double avg2 = (double) sum2 / count2;
        return (double) avg2;
    }

    public static void main(String[] args) {

        double average = average1("");
        System.out.println("Среднее арифметическое чисел: " + average);

        double averageOfEven = average2("");
        System.out.println("Среднее арифметическое четных чисел: " + averageOfEven);
    }
}