package sealed;

public sealed class Rectangle extends Shape permits FilledRectangle {
  public double length, width;

  String description =
      """
        sealed, so it can only be extended by the permitted FilledRectangle
      """;
}
