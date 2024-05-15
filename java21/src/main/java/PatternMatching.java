void main() {

}

// Switch pattern matching, specify variable name in case
record Point(int x, int y) { }
enum Color { RED, GREEN, BLUE; }

void typeTester(Object obj) {
  switch (obj) {
    // TODO - can now have a null case
    // TODO - specify variable name and use it after arrow.
    case null     -> System.out.println("null");
    case String s -> System.out.println("String");
    case Color c  -> System.out.println(STR."Color with \{c.values().length} values");
    case Point p  -> System.out.println(STR."Record class: \{p.toString()}");
    case int[] ia -> System.out.println(STR."Array of int values of length\{ia.length}");
    default       -> System.out.println("Something else");
  }
}


// When clause
static void when(Object obj) {
  switch (obj) {
    case String s when s.length() == 1 -> System.out.println(STR."Short: \{s}");
    case String s                      -> System.out.println(s);
    default                            -> System.out.println("Not a string");
  }
}

// Qualified enum Constants
sealed interface CardClassification permits Standard, Tarot {}
public enum Standard implements CardClassification
{ SPADE, HEART, DIAMOND, CLUB }
public enum Tarot implements CardClassification
{ SPADE, HEART, DIAMOND, CLUB, TRUMP, EXCUSE }

    // Older pattern
static void determineSuit(CardClassification c) {
  switch (c) {
    case Standard s when s == Standard.SPADE    -> System.out.println("Spades");
    case Standard s when s == Standard.HEART    -> System.out.println("Hearts");
    case Standard s when s == Standard.DIAMOND  -> System.out.println("Diamonds");
    case Standard s                             -> System.out.println("Clubs");
    case Tarot t when t == Tarot.SPADE          -> System.out.println("Spades or Piques");
    case Tarot t when t == Tarot.HEART          -> System.out.println("Hearts or C\u0153ur");
    case Tarot t when t == Tarot.DIAMOND        -> System.out.println("Diamonds or Carreaux");
    case Tarot t when t == Tarot.CLUB           -> System.out.println("Clubs or Trefles");
    case Tarot t when t == Tarot.TRUMP          -> System.out.println("Trumps or Atouts");
    case Tarot t                                -> System.out.println("The Fool or L'Excuse");
  }
}

    // Better, more readable pattern
static void determineSuitQualifiedNames(CardClassification c) {
  switch (c) {
    case Standard.SPADE   -> System.out.println("Spades");
    case Standard.HEART   -> System.out.println("Hearts");
    case Standard.DIAMOND -> System.out.println("Diamonds");
    case Standard.CLUB    -> System.out.println("Clubs");
    case Tarot.SPADE      -> System.out.println("Spades or Piques");
//    TODO - Note the error from non-exhaustive coverage
    case Tarot.HEART      -> System.out.println("Hearts or C\u0153ur");
    case Tarot.DIAMOND    -> System.out.println("Diamonds or Carreaux");
    case Tarot.CLUB       -> System.out.println("Clubs or Trefles");
    case Tarot.TRUMP      -> System.out.println("Trumps or Atouts");
    case Tarot.EXCUSE     -> System.out.println("The Fool or L'Excuse");
  }
}


// Record Patterns
static void printAngleFromXAxis(Object obj) {
  if (obj instanceof Point(int x, int y)) {
    // Now you can use x and y directly, instead of the next example
    System.out.println(Math.toDegrees(Math.atan2(y, x)));
  }
}

// Same as previous
static void printAngleFromXAxisTypePattern(Object obj) {
  if (obj instanceof Point p) {
    System.out.println(Math.toDegrees(Math.atan2(p.y(), p.x())));
  }
}

// Unnamed pattern
void unnamedPattern(Object obj) {
  // TODO - Elide type and name
  if (obj instanceof Point(int x, _)) {
    // I don't need the second variable, so i can use underscore
    System.out.println(x);
  }
  // TODO - Elide just the name
  if (obj instanceof Point(int x, int _)) {
    // I don't need the second variable, so i can use underscore
    System.out.println(x);
  }
}

// Unnamed variables
void unnamedVariable() {

  int[] ids = {35, 22, 49};

  int total = 0;
  for (int _ : ids) {
    total++;
  }

  try {
    System.out.println(total);
  } catch (Exception _) {
//    System.out.println("Delicious");
  }

}






