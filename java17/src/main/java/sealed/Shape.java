package sealed;

public sealed class Shape permits Circle, Square, Rectangle {

  String description =
      """
        Sealing a class allows you to specify which classes are permitted to implement it.
        permits keyword.
        Only Circle, Square, and Rectangle can extend Shape.
        Purpose is for the Superclass to be widely accessible, but not widely extensible.
        Now let's look at each of the subclasses to see what we can do.  
      """;
}
