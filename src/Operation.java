public class Operation {

    public static String calculate(Number first, Number second, String op) throws Exception {

        int result;

        switch (op) {
            case "+":
                result = first.getValue() + second.getValue();
                break;
            case "-":
                result = first.getValue() - second.getValue();
                break;
            case "*":
                result = first.getValue() * second.getValue();
                break;
            case "/":
                result = first.getValue() / second.getValue();
                break;
            default:
                throw new Exception("Не правильно введен символ операции, используйте только +, -, *, /");
        }

        if (first.getType() == Perebor.ROMAN) {
            return RimNumber.RomanNumber(result);
        } else return String.valueOf(result);
    }
}