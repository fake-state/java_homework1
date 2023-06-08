// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)

package Java_homework1;

public class first {
    public static void main(String[] args) {
        int n = functions.askNumberFromUser();
        int triangleNumber = 0;
        for (int i = 1; i <= n; i++) {
            triangleNumber += i;
        }
        System.out.println("Triangle number " + n + " is " + triangleNumber);

        // Вычисление факториала n
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}

