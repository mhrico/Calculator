public class Calculator {
    
    public static void main(String[] args) {

        CalMultiplication multiplication = new CalMultiplication();
        CalMultiplication addition = new CalAddtion();
        CalMultiplication subtraction = new CalSubtraction();
        CalMultiplication division = new CalDivsion();

        switch(args[0]) {
            case "add":
                System.out.println(addition.addition(args[1],args[2]));
                break;

            case "subtract":
                 System.out.println(subtraction.subtraction(args[1],args[2]));
                 break;

            case "multiply":
                 System.out.println(multiplication.multiplication(args[1],args[2]));
                 break;

            case "divide":
                 System.out.println(division.division(args[1],args[2]));
                 break;

            default: System.out.println("Usage: add | subtract | multiply | divide First_number Secondnumber");
        }
    }
}
