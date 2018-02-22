import java.util.Scanner;
import org.apache.log4j.*;

public class RunMenu {
    static Scanner c = new Scanner(System.in);
    final static Logger logger = Logger.getLogger(RunMenu.class);

    private static boolean validation(String digit) {
        try {
            Float.parseFloat(digit);
        } catch (NumberFormatException e) {
            return true;
        }
        if (Float.parseFloat(digit) < -20 || Float.parseFloat(digit) > 20) {
            return true;
        }
        return false;
    }

    private static Calculation numberEntering() {
        Calculation calculation = new Calculation();
        System.out.println("Please enter your two digits in -20 +20 range");
        String firstEnterdSymbol = c.next();
        while (validation(firstEnterdSymbol)) {
            System.out.println("Please retry, the digit must be in range between -20 +20 and not string");
            firstEnterdSymbol = c.next();
            validation(firstEnterdSymbol);
        }
        calculation.setFirstDigit(Float.parseFloat(firstEnterdSymbol));
        System.out.println("Now enter the second one");
        String secondEnteredSymbol = c.next();

        while (validation(secondEnteredSymbol)) {
            System.out.println("Please retry, the digit must be in range between -20 +20 and not string");
            secondEnteredSymbol = c.next();
            validation(secondEnteredSymbol);
        }
        calculation.setSecondDigit(Float.parseFloat(secondEnteredSymbol));

        return calculation;
    }

    public static void menu() {
        Calculation calculation = numberEntering();
        int i;
        System.out.println("Please choose what to do with this digits for exit enter \"0\"\n" +
                "1 - add\n" +
                "2 - subtraction\n" +
                "3 - multiplication\n" +
                "4 - concatenation\n" +
                "0 - exit");
        i = c.nextInt();
        switch (i) {
            case 1:
                logger.info(java.time.LocalDate.now() + "  adding of " + calculation.getFirstDigit() + " and " + calculation.getSecondDigit() + " result = " + calculation.add());
                break;
            case 2:
                logger.info(java.time.LocalDate.now() + "  subtraction of " + calculation.getFirstDigit() + " and " + calculation.getSecondDigit() + " result = " + calculation.subtraction());
                break;
            case 3:
                logger.info(java.time.LocalDate.now() + "  multiplication of " + calculation.getFirstDigit() + " and " + calculation.getSecondDigit() + " result = " + calculation.multiplication());
                break;
            case 4:
                logger.info(java.time.LocalDate.now() + "  concatenation of " + calculation.getFirstDigit() + " and " + calculation.getSecondDigit() + " result = " + calculation.concatenation());
                break;
            case 0:
                System.exit(0);
                break;
        }
        menu();
    }
}

