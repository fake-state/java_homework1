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
}
