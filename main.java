import javax.sound.midi.SysexMessage;
import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        calc("sad");
    }

    //method for calculating nums
    public static int calculation(int num1, int num2, String operation){
        int result = 0;
        if ("+".equals(operation)) {
            result = num1 + num2;
        } else if ("-".equals(operation)) {
            result = num1 - num2;
        } else if ("*".equals(operation)) {
            result = num1 * num2;
        } else if ("/".equals(operation)) {
            result = num1 / num2;
        } else {
            System.out.print("You can use only + - * / operations");
        }
        return result;
    }

    //method which calculates Roman numerals
    public static String romanNumerals(int rimNum1, int rimNum2, String operation){
        int result = calculation(rimNum1, rimNum2, operation);
        if (result < 1) {
            System.out.println("Result of Roman numerals is less then 1. Please try again");
            System.exit(0);
        }
        String resultRoman = "";
        switch(result){
            case 1: resultRoman = "I"; break;
            case 2: resultRoman = "II"; break;
            case 3: resultRoman = "III"; break;
            case 4: resultRoman = "IV"; break;
            case 5: resultRoman = "V"; break;
            case 6: resultRoman = "VI"; break;
            case 7: resultRoman = "VII"; break;
            case 8: resultRoman = "VIII"; break;
            case 9: resultRoman = "IX"; break;
            case 10: resultRoman = "X"; break;
            case 11: resultRoman = "XI"; break;
            case 12: resultRoman = "XII"; break;
            case 13: resultRoman = "XIII"; break;
            case 14: resultRoman = "XIV"; break;
            case 15: resultRoman = "XV"; break;
            case 16: resultRoman = "XVI"; break;
            case 17: resultRoman = "XVII"; break;
            case 18: resultRoman = "XVIII"; break;
            case 19: resultRoman = "XIX"; break;
            case 20: resultRoman = "XX"; break;

        }
        return resultRoman;
    }

    public static String calc (String input)  {
        int result = 0;
        int num1 = 0;
        int num2 = 0;
        String rimNum1;
        String rimNum2;
        String operation;
        Scanner in = new Scanner(System.in);


        while(true) {
            System.out.print("Input an logic expression as x + y:");
            String expression = in.nextLine();
            //splitting expression for 3 parts
            String[] parts = expression.split(" ");
            operation = parts[1];

            //checking if it less than 10
            try {
                num1 = Integer.parseInt(parts[0]);
                num2 = Integer.parseInt(parts[2]);
                if ((num1 > 10) || (num2 > 10)) {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.println("One of number or both are more than 10");
                        return input;
                    }
                }
                System.out.print("Result is ");
                System.out.print(calculation(num1, num2, operation));

                //checking if it Roman numerals
            } catch (NumberFormatException e) {
                rimNum1 = parts[0];
                rimNum2 = parts[2];
                switch(rimNum1){
                    case "I": num1 = 1; break;
                    case "II": num1 = 2; break;
                    case "III": num1 = 3; break;
                    case "IV": num1 = 4; break;
                    case "V": num1 = 5; break;
                    case "VI": num1 = 6; break;
                    case "VII": num1 = 7; break;
                    case "VIII": num1 = 8; break;
                    case "IX": num1 = 9; break;
                    case "X": num1 = 10; break;
                    default: System.out.println("First expression is more than X or isn't Roman numerals"); return input;
                }
                switch(rimNum2){
                    case "I": num2 = 1; break;
                    case "II": num2 = 2; break;
                    case "III": num2 = 3; break;
                    case "IV": num2 = 4; break;
                    case "V": num2 = 5; break;
                    case "VI": num2 = 6; break;
                    case "VII": num2 = 7; break;
                    case "VIII": num2 = 8; break;
                    case "IX": num2 = 9; break;
                    case "X": num2 = 10; break;
                    default: System.out.println("Second expression is more than X or isn't Roman numerals"); return input;
                }
                System.out.println("Roman numerals result is ");
                System.out.print(romanNumerals(num1, num2, operation));
            }
            return input;
        }
    }
}

