package newstringmethods;

import java.lang.invoke.MethodHandles;

public class NewStringMethods {

  public static void main(String[] args) {
    NewStringMethods newStringMethods = new NewStringMethods();

    newStringMethods.java11();
    newStringMethods.java12();
    newStringMethods.java15();
  }

  public void java11() {
    System.out.println("String \"\" is blank? " + "".isBlank());

    "Stream\nthe\nlines\n".lines().forEach(System.out::println);

    System.out.println("Copy this\n".repeat(2));

    System.out.println("      Remove the surround whitespace    ".strip());

    System.out.println("        Remove leading".stripLeading());

    System.out.println("Remove trailing              ".stripTrailing());
  }

  public void java12() {
    System.out.println("Indentation".indent(4));

    String transformed =
        "Hello, World!"
            .transform(String::toUpperCase)
            .transform(str -> str.replace("WORLD", "Universe"));
    System.out.println(transformed);

    System.out.println("What the heck is describeConstable() for?".describeConstable().get());

    System.out.println("Not sure either".resolveConstantDesc(MethodHandles.lookup()));
  }

  public void java15() {
//    String.format()
    System.out.println("Hi there %s".formatted("Bob"));
    System.out.println("    hello\n    world".stripIndent());

    System.out.println(
        "Tab \t Next Line \n Space \s Single Quote \' Double Quote \" ".translateEscapes());
  }
}
