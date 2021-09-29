import util.RomanToArabic;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Input {

    public static String input() throws IOException{
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s = str.replaceAll(" ", "");
        String[] input = s.split("[/*+-]");

        if (input.length > 2) {
            throw new IOException("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        }
        if (input.length <= 1) {
            throw new IOException("Строка не является математической операцией");
        }

        String s2 = Arrays.toString(input).replaceAll("[(),. !?:;\\[\\]]", "");


        if (s2.matches("[0-9]+")) {
            int a1 = Integer.parseInt(input[0]);
            int a2 = Integer.parseInt(input[1]);
            if (a1 > 10 | a2 > 10) {
                throw new IOException("Введенное число больше 10");
            }
            return s;
        }

        if(Pattern.matches("[a-zA-Z]+", s2)){
            if(RomanToArabic.romanToArabic(input[0]) > 10 | RomanToArabic.romanToArabic(input[1]) > 10){
                throw new IOException("Введенное число больше 10");
            }
            return s;
        }

        if(true){
            throw new IOException("Используются одновременно разные системы счисления");
        }




        return null;
    }
}
