import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IProcess {
    static String calculateExpression(String firstOperand, String operator, String secondOperand) {
        if (operator.equals("+")) {
            return Double.toString(Double.parseDouble(firstOperand) + Double.parseDouble(secondOperand));
        }
        if (operator.equals("-")) {
            return Double.toString(Double.parseDouble(firstOperand) - Double.parseDouble(secondOperand));
        }
        if (operator.equals("*")) {
            return Double.toString(Double.parseDouble(firstOperand) * Double.parseDouble(secondOperand));
        }
        if (operator.equals("/")) {
            return Double.toString(Double.parseDouble(firstOperand) / Double.parseDouble(secondOperand));
        }
        return "";
    }

    static String process(String str) {
        Pattern patternForExp = Pattern.compile("\\d{1,}[-+*/]\\d{1,}");
        Matcher matcherForExp = patternForExp.matcher(str);
        while (matcherForExp.find()) {
            String expression = matcherForExp.group();

            Pattern patternForOperand = Pattern.compile("\\d{1,}");
            Matcher matcherForOperand = patternForOperand.matcher(expression);

            String operands[] = new String[2];

            matcherForOperand.find();
            operands[0] = matcherForOperand.group();
            String operator = expression.substring(matcherForOperand.end(), matcherForOperand.end() + 1);
            operands[1] = expression.substring(matcherForOperand.end() + 1);

            String result = calculateExpression(operands[0], operator, operands[1]);
            str = matcherForExp.replaceFirst(result);
            matcherForExp = patternForExp.matcher(str);
        }

        return str;
    }
}
