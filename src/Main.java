import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ограничение: ");
        double n = input.nextDouble();
        System.out.print("Введите чмсло: ");
        double x = input.nextDouble();
        double sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (Math.pow(-1,i) * Math.pow(x,2*i))/factorial(2*i);
        }
        System.out.println("Результат: " + sum);
    }
    static double factorial(double b) {
        double res = 1;
        for (int i = 1; i <= b; i++) {
            res *= i;
        }
        return res;
    }
}
