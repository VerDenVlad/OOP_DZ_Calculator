import java.util.Scanner;

public class ViewCalculator {

    private ICalculableFactory calculableFactory;

    public ViewCalculator(ICalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        while (true) {
            int primaryArg = promptInt("Введите значение: ");
            Calculable calculator = calculableFactory.create(primaryArg, true);
            while (true) {
                String cmd = prompt("Введите команду (+, -, *, /, =) : ");
                if (cmd.equals("+")) {
                    int arg = promptInt("Введите значение: ");
                    calculator.plus(arg);
                    continue;
                }
                if (cmd.equals("-")) {
                    int arg = promptInt("Введите значение: ");
                    calculator.minus(arg);
                    continue;
                }
                if (cmd.equals("*")) {
                    int arg = promptInt("Введите значение: ");
                    calculator.multiply(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                    int arg = promptInt("Введите значение: ");
                    calculator.share(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    int result = calculator.getResult();
                    System.out.printf("Результат %d\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                System.out.println();
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