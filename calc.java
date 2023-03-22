//   К калькулятору из предыдущего дз добавить логирование.


import java.util.Scanner;
import java.util.logging.*;

public class calc {
        
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(calc.class.getName());

        Scanner sc = new Scanner(System.in);

        logger.info("Введите первое число: ");
        double num1 = sc.nextDouble();
        logger.info("Введите второе число: ");
        double num2 = sc.nextDouble();

        logger.info("Введите один оператор (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        sc.close();
        double result;

        switch(operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                logger.severe("Введен неверный оператор");
                return;
        }

        logger.info(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
