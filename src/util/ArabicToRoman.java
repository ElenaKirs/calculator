package util;

import java.util.List;

public class ArabicToRoman {
    public static String arabicToRoman(int number) throws IllegalArgumentException {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException("В римской системе нет отрицательных чисел");
        }

        List<RomanNumber> romanNumerals = RomanNumber.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();


        while ((number > 0) && (i < romanNumerals.size())) {
            RomanNumber currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getValue();
            } else {
                i++;
            }
        }

        return sb.toString();
    }

}
