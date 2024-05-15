package sealed;

public sealed class Figure {

  String description =
      """
        The permits clause can be omitted
        if its permitted classes are
        defined in the same file.
    """;

  public boolean isSealed() {
    // Class has `isSealed()` method
    return this.getClass().isSealed();
  }

  public Class<?>[] permittedSubclasses() {
    // Returns an array of the permitted classes.
    return this.getClass().getPermittedSubclasses();
  }
}

final class Circle2 extends Figure {
  float radius;
}

non-sealed class Square2 extends Figure {
  float side;
}

sealed class Rectangle2 extends Figure {
  float length, width;
}

final class FilledRectangle2 extends Rectangle2 {
  int red, green, blue;
}
