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
            case 21: resultRoman = "XXI"; break;
            case 22: resultRoman = "XXII"; break;
            case 23: resultRoman = "XXIII"; break;
            case 24: resultRoman = "XXIV"; break;
            case 25: resultRoman = "XXV"; break;
            case 26: resultRoman = "XXVI"; break;
            case 27: resultRoman = "XXVII"; break;
            case 28: resultRoman = "XXVIII"; break;
            case 29: resultRoman = "XXIX"; break;
            case 30: resultRoman = "XXX"; break;
            case 31: resultRoman = "XXXI"; break;
            case 32: resultRoman = "XXXII"; break;
            case 33: resultRoman = "XXXIII"; break;
            case 34: resultRoman = "XXXIV"; break;
            case 35: resultRoman = "XXXV"; break;
            case 36: resultRoman = "XXXVI"; break;
            case 37: resultRoman = "XXXVII"; break;
            case 38: resultRoman = "XXXVIII"; break;
            case 39: resultRoman = "XXXIX"; break;
            case 40: resultRoman = "XL"; break;
            case 41: resultRoman = "XLI"; break;
            case 42: resultRoman = "XLII"; break;
            case 43: resultRoman = "XLIII"; break;
            case 44: resultRoman = "XLIV"; break;
            case 45: resultRoman = "XLV"; break;
            case 46: resultRoman = "XLVI"; break;
            case 47: resultRoman = "XLVII"; break;
            case 48: resultRoman = "XLVIII"; break;
            case 49: resultRoman = "XLIX"; break;
            case 50: resultRoman = "L"; break;
            case 51: resultRoman = "LI"; break;
            case 52: resultRoman = "LII"; break;
            case 53: resultRoman = "LIII"; break;
            case 54: resultRoman = "LIV"; break;
            case 55: resultRoman = "LV"; break;
            case 56: resultRoman = "LVI"; break;
            case 57: resultRoman = "LVII"; break;
            case 58: resultRoman = "LVIII"; break;
            case 59: resultRoman = "LIX"; break;
            case 60: resultRoman = "LX"; break;
            case 61: resultRoman = "LXI"; break;
            case 62: resultRoman = "LXII"; break;
            case 63: resultRoman = "LXIII"; break;
            case 64: resultRoman = "LXIV"; break;
            case 65: resultRoman = "LXV"; break;
            case 66: resultRoman = "LXVI"; break;
            case 67: resultRoman = "LXVII"; break;
            case 68: resultRoman = "LXVIII"; break;
            case 69: resultRoman = "LXIX"; break;
            case 70: resultRoman = "LXX"; break;
            case 71: resultRoman = "LXXI"; break;
            case 72: resultRoman = "LXXII"; break;
            case 73: resultRoman = "LXXIII"; break;
            case 74: resultRoman = "LXXIV"; break;
            case 75: resultRoman = "LXXV"; break;
            case 76: resultRoman = "LXXVI"; break;
            case 77: resultRoman = "LXXVII"; break;
            case 78: resultRoman = "LXXVIII"; break;
            case 79: resultRoman = "LXXIX"; break;
            case 80: resultRoman = "LXXX"; break;
            case 81: resultRoman = "LXXXI"; break;
            case 82: resultRoman = "LXXXII"; break;
            case 83: resultRoman = "LXXXIII"; break;
            case 84: resultRoman = "LXXXIV"; break;
            case 85: resultRoman = "LXXXV"; break;
            case 86: resultRoman = "LXXXVI"; break;
            case 87: resultRoman = "LXXXVII"; break;
            case 88: resultRoman = "LXXXVIII"; break;
            case 89: resultRoman = "LXXXIX"; break;
            case 90: resultRoman = "LXL"; break;
            case 91: resultRoman = "LXLI"; break;
            case 92: resultRoman = "LXLII"; break;
            case 93: resultRoman = "LXLIII"; break;
            case 94: resultRoman = "LXLIV"; break;
            case 95: resultRoman = "LXLV"; break;
            case 96: resultRoman = "LXLVI"; break;
            case 97: resultRoman = "LXLVII"; break;
            case 98: resultRoman = "LXLVIII"; break;
            case 99: resultRoman = "LXLIX"; break;
            case 100: resultRoman = "С"; break;
          
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

            if (parts.length>3){
                System.out.println("Type only expression with two operand and one operator");
                return input;
            }
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

