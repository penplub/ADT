import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Valid
 */
public class Valid {
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("C:/Users/TUF GAMING/Desktop/T7/intput1.txt");
        Scanner myscan = new Scanner(f);
        Stack<String> stack = new Stack<>();// create stack
        while (myscan.hasNextLine()) {// scan if it has nextline
            String dataLine = myscan.nextLine();
            String[] tokens = dataLine.split("\\s+");// break to token
            for (String token : tokens) {
                if (isNumeric(token)) {//check if it numeric
                    stack.push(token);//push
                } else if (token.length() > 1) {//if not check token length
                    for (int i = 0; i < token.length(); i++) {
                        String c = Character.toString(token.charAt(i));//if it character
                        if (isNumeric(c)) {//checkagain id it numeric
                            stack.push(c);
                        } else {
                            Integer result = performOperation(c, stack.pop(), stack.pop());//if not check if it operator
                            stack.push(result.toString());//push to stack
                        }
                    }
                } else {
                    Integer result = performOperation(token, stack.pop(), stack.pop());
                    stack.push(result.toString());
                }
            }
        }
        if (stack.size() == 1 && isNumeric(stack.pop())) {//check that valid or invalid
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static boolean isNumeric(String num) {//check numeric
        if (num == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(num);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static Integer performOperation(String operator, String operand2, String operand1) {//check if it operator
        Integer op1 = Integer.parseInt(operand1);
        Integer op2 = Integer.parseInt(operand2);
        switch (operator) {
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
                return op1 / op2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
