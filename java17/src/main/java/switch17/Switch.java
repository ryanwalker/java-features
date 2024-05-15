package switch17;

public class Switch {

  public static void main(String[] args){
    Switch sw = new Switch();

    System.out.println(sw.oldSwitch(DayOfWeek.MON));
    System.out.println(sw.java17Switch(DayOfWeek.MON));

  }

  enum DayOfWeek {
    MON,
    TU,
    WED,
    THU,
    FRI,
    SAT,
    SUN
  }

  // Old way
  public String oldSwitch(DayOfWeek day) {
    String retVal = "";
    // Note IDEA's suggestion to chagne to the new format, which we see in the next method below.
    switch (day) {
      case MON:
      case TU:
      case WED:
      case THU:
      case FRI:
        retVal = "weekday";
        break;
      case SUN:
        retVal = "weekend";
        break;
    }
    return retVal;
  }

  // New way
  public String java17Switch(DayOfWeek day) {

    // * Multiple matching values on 1 line.
    // * Can return switch statement, it is now an expression.
    // * If you return it, you must cover all cases, or you will get an error.
    // * Arrow syntax instead of break.
    // * yield keyword needed if it's a block.
    return switch (day) {
      case MON, TU, WED, THU, FRI -> "weekday";
      case SAT, SUN -> {
        System.out.println("this is a weekend");
        yield "weekend";
      }
    };
  }
}
