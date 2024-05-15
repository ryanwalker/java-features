package textblocks;

public class TextBlocks {

  public static void main(String[] args) {

    String textBlocksDescription =
        """
      * Start with 3 double quotes (") followed by optional whitespace and newline
      * Use newlines and quotes without escaping them
      * Indentation is determined by position of the closing delimiter
      * String templates is a Java21 PREVIEW FEATURE still (sadly)
      * Idea syntax highlighting with //language=json (or java or whatever)
    """;

    // language=json
    String json =
        """
        {
          "key": "value",
          "firstName": "Bob",
          "lastName": "Walters"
        }
        """;

    // language=java
    String java =
        """
      public class Hello {
        // Look at this nice error syntax in the text block itself!
        pri vate final String name;
      }
      """;

    //language=bash
    String bash =
        """
        echo "I'm a bash script";
        """;

    System.out.println(textBlocksDescription);
    System.out.println(json);
    System.out.println(java);
    System.out.println(bash);
  }
}
