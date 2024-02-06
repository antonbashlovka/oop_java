package View;

import Interface.iCalcItem;
import Interface.iCalculable;

import java.util.Scanner;

public class ViewCalculatorCompl implements iCalcItem{

    private iCalculable calculator;

    @Override
    public void open(){
        this.run();
    }

    public ViewCalculatorCompl (iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int realPart1 = promptInt("Введите действительную часть первого аргумента: ");
            int imgPart1 = promptInt("Введите мнимую часть первого аргумента: ");

            calculator.save(realPart1, imgPart1);

            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int realPart2 = promptInt("Введите действительную часть второго аргумента: ");
                    int imgPart2 = promptInt("Введите действительную часть второго аргумента: ");
                    calculator.multi(realPart2, imgPart2);
                    continue;
                }
                if (cmd.equals("+")) {
                    int realPart2 = promptInt("Введите действительную часть второго аргумента: ");
                    int imgPart2 = promptInt("Введите действительную часть второго аргумента: ");
                    calculator.sum(realPart2, imgPart2);
                    continue;
                }
                if (cmd.equals("/")) {
                    int realPart2 = promptInt("Введите действительную часть второго аргумента: ");
                    int imgPart2 = promptInt("Введите действительную часть второго аргумента: ");
                    calculator.divide(realPart2, imgPart2);
                    continue;
                }
                if (cmd.equals("=")) {
                    calculator.printResult();
                    break;
                }
            }

            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
