public class Calculator {
    
    public static void main(String[] args) {
        switch(args[0]) {
            case "add":
                System.out.println(addition(args[1],args[2]));
                break;

            case "subtract":
                 System.out.println(subtraction(args[1],args[2]));
                 break;

            case "multiply":
                 System.out.println(multiplication(args[1],args[2]));
                 break;

             case "subtract":
                 System.out.println(subtraction(args[1],args[2]));
                 break;

            case "divide":
                 System.out.println(subtraction(args[1],args[2]));
                 break;
                 
            default: System.out.println("Usage: add | subtract | multiply | divide First_number Secondnumber");
        }
    }
}
