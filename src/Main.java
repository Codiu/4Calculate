import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Input 2 item expression: ");
        String input = myObj.nextLine();

        // clean spaces
        input = input.replaceAll("\\s+","");
        int result;
        double resultDouble;
        // traverse expression
        for (int i = 1; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case '+':
                    result = Integer.parseInt(input.substring(0, i)) + Integer.parseInt(input.substring(i + 1));
                    System.out.println(result);
                    break;
                case '-':
                    result = Integer.parseInt(input.substring(0, i)) - Integer.parseInt(input.substring(i + 1));
                    System.out.println(result);
                    break;
                case '/':
                    resultDouble = Double.parseDouble(input.substring(0, i)) / Integer.parseInt(input.substring(i + 1));
                    System.out.println(resultDouble);
                    break;
                case '*':
                    result = Integer.parseInt(input.substring(0, i)) * Integer.parseInt(input.substring(i + 1));
                    System.out.println(Integer.parseInt(input.substring(0, i)) + " * " + Integer.parseInt(input.substring(i + 1)) + " = " + result);
                    break;
                default:
                    break;
            }
        }
    }
}