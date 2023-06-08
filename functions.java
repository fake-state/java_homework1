package Java_homework1;
import java.util.Scanner;

public class functions {
    
    static Integer askNumberFromUser(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число > ");
        Integer n = iScanner.nextInt();

        iScanner.close();
        return n;
    }

    public static char getOperation(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите операцию:");
        char operation;
        if(iScanner.hasNext()){
            operation = iScanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            iScanner.next();//рекурсия
            operation = getOperation();
        }
        iScanner.close();
        return operation;
    }

    static int getInt(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num;
        if(iScanner.hasNextInt()){
            num = iScanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            iScanner.next();//рекурсия
            num = getInt();
        }
    
        return num;
    }
    
}
