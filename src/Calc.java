import util.ArabicToRoman;
import util.RomanToArabic;

import java.util.Map;

public class Calc {

    public static void calc(Map<String, String> map){
    String znak = map.get("operator");
    String opOne = map.get("firstValue");
    String opTwo = map.get("secondValue");

    if(map.get("type").equals("arab")){
        int operand1 = Integer.parseInt(opOne);
        int operand2 = Integer.parseInt(opTwo);
        switch (znak){
            case "/":
                System.out.println(operand1 / operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
        }

    }
    if(map.get("type").equals("roman")){
        int operand1 = RomanToArabic.romanToArabic(opOne.trim());
        int operand2 = RomanToArabic.romanToArabic(opTwo.trim());

        switch (znak){
            case "/":
                System.out.println(ArabicToRoman.arabicToRoman(operand1 / operand2));
                break;
            case "*":
                System.out.println(ArabicToRoman.arabicToRoman(operand1 * operand2));
                break;
            case "-":
                System.out.println(ArabicToRoman.arabicToRoman(operand1 - operand2));
                break;
            case "+":
                System.out.println(ArabicToRoman.arabicToRoman(operand1 + operand2));
                break;
        }


    }
    }
}
