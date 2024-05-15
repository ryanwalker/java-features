package sealed;

public non-sealed class Square extends Shape {
  public double side;

  String description =
      """
        Non-sealed, so this class can be extended.
      """;
}
