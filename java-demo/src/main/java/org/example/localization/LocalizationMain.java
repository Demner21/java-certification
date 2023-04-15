package org.example.localization;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class LocalizationMain {
    private Locale locale;

    public static void main(String[] args) throws ParseException {
        var main = new LocalizationMain();
        main.locale = Locale.getDefault();
        System.out.println(main.locale);
        //Locale language: en :: lowercase
        //Locale country: US :: country::UPPERCASE
        System.out.println(new Locale("es", "PE"));

        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(main.locale);
        BigDecimal bigDecimal = BigDecimal.valueOf(2500);
        System.out.println(currencyInstance.format(bigDecimal));
        NumberFormat currencyPE = NumberFormat.getCurrencyInstance(new Locale("es", "PE"));
        System.out.println(currencyPE.format(bigDecimal));
        //System.out.println(currencyPE.parse("S/  2,500")); //a bug in java

        double value = (Double) currencyInstance.parse("$25,330.99");
        System.out.println(value);


    }

}
