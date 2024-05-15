String unnamedClass =
    """
      It allows methods, fields, and classes to exist without explicit class declarations.
    """;

void main() {
  System.out.println(
      """
      
      Instance main method in an unnamed class. Easier to get started with Java!!!
      
      Unfortunately, I am a feature preview, turned on with an IDEA or compiler setting.
        the launch protocol follows a specific order to decide which main method to use:

        1 a static void main(String[] args) method declared in the launched class
        2 a static void main() method declared in the launched class
        3 a void main(String[] args) instance method declared in the launched class or inherited from a superclass
        4 a void main() instance method
      """);
}
