package compactnumberformatting;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;

public class CompactNumberFormatting {

  public static void main(String[] args){
    NumberFormat canadaShort = NumberFormat.getCompactNumberInstance(Locale.CANADA, Style.SHORT);
    System.out.println(canadaShort.format(10034000));

    NumberFormat canadaLong = NumberFormat.getCompactNumberInstance(Locale.CANADA, Style.LONG);
    System.out.println(canadaLong.format(10034000));

    NumberFormat germanShort = NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT);
    System.out.println(germanShort.format(10034000));

    // Will make text plural depending on the locale
    NumberFormat germanLong = NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG);
    System.out.println(germanLong.format(10034000));
  }
}
