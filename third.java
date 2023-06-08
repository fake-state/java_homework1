package Java_homework1;
public class third {
    
    public static void main(String[] args) {

        int num1 = functions.getInt();
        int num2 = functions.getInt();
        char operation = functions.getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, functions.getOperation());//рекурсия
        }
        return result;
    }
    
}